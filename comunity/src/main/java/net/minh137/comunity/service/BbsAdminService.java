package net.minh137.comunity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.minh137.comunity.mapper.BbsAdminMapper;
import net.minh137.comunity.model.BbsAdmin;

@Service
public class BbsAdminService {
	
	@Autowired
	private BbsAdminMapper bbsAdminMapper;
	
	public int editBbsAdmin(BbsAdmin bbsAdmin) {
		return bbsAdminMapper.updateBbsAdmin(bbsAdmin);
	}
	

}
