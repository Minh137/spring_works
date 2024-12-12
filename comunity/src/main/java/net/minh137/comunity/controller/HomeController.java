package net.minh137.comunity.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.minh137.comunity.model.BbsAdmin;
import net.minh137.comunity.model.CustomUserDetails;
import net.minh137.comunity.model.FileDto;
import net.minh137.comunity.model.Member;
import net.minh137.comunity.service.BbsAdminService;
import net.minh137.comunity.service.BbsService;
import net.minh137.comunity.service.FileService;

@Controller
public class HomeController {

	@Autowired
	BbsService bbsService;
	
	@Autowired
	BbsAdminService bbsAdminService;
	
	@Autowired
	private FileService fileService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		String userid = null;
		
		//���������� �̿��� ����� ���� ��������
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println("����" + auth);
		if(auth != null && auth.getPrincipal() instanceof CustomUserDetails) {	
		     CustomUserDetails userDetails = (CustomUserDetails) auth.getPrincipal();
		     userid = userDetails.getUsername();
		     Member member = userDetails.getMember();
             model.addAttribute("member", member);
		}
		
		List<BbsAdmin> bbsAdminLists = bbsAdminService.getAllBbsList();
		List<Map<String, Object>> latestPosts = bbsService.selectLatestPostsMain();
		
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		for(Map<String, Object> post : latestPosts) {
			Object wdateObj = post.get("wdate");
			LocalDateTime dateTime; 
			if(wdateObj instanceof LocalDateTime) {
				dateTime = (LocalDateTime) wdateObj;
			}else if(wdateObj instanceof Timestamp) {
				dateTime = ((Timestamp) wdateObj).toLocalDateTime();
			}else {
				continue; //Ÿ���� �ʸ����� �������� 
			}
			
			//24�ð� �̳��̸� ��:������
			if(dateTime.isAfter(now.minusHours(24))){
			   post.put("latesttime", dateTime.format(timeFormatter));
			}else {			
			//24�ð� ���ĸ� ����� ����
				post.put("latesttime", dateTime.format(dateFormatter));
			}	
			
			//�̹��� �̱� (�� id�� ù��° �̹����� ����)
			if("gallery".equals(post.get("skin"))) {
				long bbsid = (long) post.get("bbs_id");
				List<FileDto> files = fileService.getFilesByBbsId(bbsid);
				if(!files.isEmpty()) {
					post.put("fileFirst", files.get(0));
				}
			}
			
		}
		
		//�α�˻��� ���
		List<Map<String, Object>> popularKeywords = bbsService.getPopularKeyword();
		model.addAttribute("popularKeywords", popularKeywords);
		
		model.addAttribute("bbsAdminLists", bbsAdminLists );
		model.addAttribute("latestPosts", latestPosts);
		model.addAttribute("userid", userid );
		
		return "main.home";
	}
	
}
