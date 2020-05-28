package main.service;

import java.util.Date;
import java.util.List;

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
	public Member Login(String account, String password);

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
	public int Registers(Member member);
	/*
	 * 
	 * 功能描述：修改的方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:4月29日 15:33
	 */
	public int update(Integer id, String account, Character isBlock, String salt, Integer infoId, Character isCancel,
			String password, Date creationTime);
	
	/*
	 * 
	 * 功能描述：根据id查询的方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:4月29日 15:33
	 */
	public Member queryMember(Integer id);
	
	
	public Member queryMemberAccount(String account);
}
