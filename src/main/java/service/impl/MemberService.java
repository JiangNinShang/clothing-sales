package service.impl;

import domain.Member;

public interface MemberService {
	boolean Login(String account, String password);
	boolean Register(Member member);
	boolean update(Member member);
}
