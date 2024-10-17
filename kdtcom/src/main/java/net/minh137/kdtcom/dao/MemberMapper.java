package net.minh137.kdtcom.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.minh137.kdtcom.model.MemberDto;

@Mapper
public interface MemberMapper {
	//회원정보 조회
	MemberDto findById(int id);
	//
	List<MemberDto> findList();
	
	void insertMember(MemberDto mem);
	
	void updateMember(MemberDto mem);
	
	void deleteMember(MemberDto mem);
}
