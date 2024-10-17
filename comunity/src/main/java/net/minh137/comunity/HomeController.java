package net.minh137.comunity;

import java.util.Locale;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.minh137.comunity.model.CustomUserDetails;
import net.minh137.comunity.model.Member;


@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		String userid = null;
		
		//인증정보를 이용한 사용자 정보 가져오기
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println("권한" + auth);
		if(auth != null && auth.getPrincipal() instanceof CustomUserDetails) {	
		     CustomUserDetails userDetails = (CustomUserDetails) auth.getPrincipal();
		     userid = userDetails.getUsername();
		     Member member = userDetails.getMember();
		 	 System.out.println("유저아디" + userDetails.toString());
             model.addAttribute("member", member);
		}
	
		model.addAttribute("userid", userid );
		
		return "home";
	}
	
}

