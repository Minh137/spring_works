package net.minh137.comunity.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.minh137.comunity.mapper.MemberMapper;
import net.minh137.comunity.model.Member;
import net.minh137.comunity.model.MemberRole;

@Repository
public class MemberDaoIpml implements MemberDao {
	
	@Autowired
	private MemberMapper mem;

	@Override
	public List<Member> getAllmem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member getMem(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertMem(Member dto) {
		// TODO Auto-generated method stub
		mem.setInsertMember(dto);
	}

	@Override
	public void updateMem(Member dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delMem(int num) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertMemRole(MemberRole rdto) {
		// TODO Auto-generated method stub
		mem.setInsertRole(rdto);
	}

}
