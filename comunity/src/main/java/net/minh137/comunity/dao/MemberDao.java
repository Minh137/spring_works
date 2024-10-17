package net.minh137.comunity.dao;

import java.util.List;

import net.minh137.comunity.model.Member;
import net.minh137.comunity.model.MemberRole;

public interface MemberDao {
	List<Member> getAllmem();
	Member getMem(int num);
	void insertMem(Member dto);
	void insertMemRole(MemberRole rdto);
	void updateMem(Member dto);
	void delMem(int num);
}
