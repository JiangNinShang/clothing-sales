package main.service;

import main.domin.Member;

public interface MemberService {

	/*
	 * 功能描述：登录的方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:4月28日 14:22
	 */
	public boolean Login(String account, String password);

	/*
	 * 
	 * 功能描述：注册的方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:4月29日 15:33
	 */
	public boolean Register(Member member);

	/*
	 * 功能描述:修改用户的方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:4月29日 15:33
	 */
	public boolean update(Member member);
}
