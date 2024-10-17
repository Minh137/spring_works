package net.minh137.kdtcom.dao;

import java.util.List;

import net.minh137.kdtcom.model.MemberDto;

public interface MemberDao {
	List<MemberDto> getAllmem();
	MemberDto getMem(int num);
	void insertMem(MemberDto dto);
	void iupdateMem(MemberDto dto);
	void delMem(int num);
}
