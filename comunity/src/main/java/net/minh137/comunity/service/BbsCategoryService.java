package net.minh137.comunity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.minh137.comunity.model.BbsAdmin;
import net.minh137.comunity.model.BbsCategory;

@Service
public class BbsCategoryService {

	@Autowired
	private BbsAdminService adminService;
	
	public List<BbsCategory> getCategories(int bbsid){
		BbsAdmin bbsAdminDto = adminService.getBbsAdminData(bbsid);
		return (bbsAdminDto.getCategory() > 0 ) 
				? adminService.getBbsCategoryById(bbsid)
			    : new ArrayList<>();
	}
}
