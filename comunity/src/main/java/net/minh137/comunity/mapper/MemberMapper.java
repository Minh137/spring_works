package net.minh137.comunity.mapper;

import java.util.List;

import net.minh137.comunity.model.Member;
import net.minh137.comunity.model.MemberRole;

public interface MemberMapper {
	   Member getMemberUserId(String userid);  
	   List<MemberRole> getMemberRole(int membersid); 
	   
	   void setInsertMember(Member member);
	   void setInsertRole(MemberRole memberRole);
	}
