package net.minh137.comunity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import net.minh137.comunity.mapper.MemberMapper;
import net.minh137.comunity.model.CustomUserDetails;
import net.minh137.comunity.model.Member;
import net.minh137.comunity.model.MemberRole;

public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Member member = memberMapper.getMemberUserId(username);
		if(member == null) {
			throw new UsernameNotFoundException("회원정보가 없습니다.");
		}
		List<MemberRole> roles = memberMapper.getMemberRole(member.getId());
	
		return new CustomUserDetails(member, roles);
	}

}