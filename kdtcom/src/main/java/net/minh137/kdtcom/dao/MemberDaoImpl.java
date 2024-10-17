package net.minh137.kdtcom.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.minh137.kdtcom.model.MemberDto;

public class MemberDaoImpl implements MemberDao {

	@Autowired
	private MemberMapper mem;
	
	@Override
	public List<MemberDto> getAllmem() {
		
		return mem.findList();
	}

	@Override
	public MemberDto getMem(int num) {
		// TODO Auto-generated method stub
		return mem.findById(num);
	}

	@Override
	public void insertMem(MemberDto dto) {
		// TODO Auto-generated method stub
		mem.insertMember(dto);
	}

	@Override
	public void iupdateMem(MemberDto dto) {
		// TODO Auto-generated method stub
		mem.updateMember(dto);
	}

	@Override
	public void delMem(int num) {
		// TODO Auto-generated method stub
		mem.deleteMember(null);
	}

}
