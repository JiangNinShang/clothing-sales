
package main.web.controller.wang;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.domin.Member;
import main.service.MemberService;


@RestController
@RequestMapping("Member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	/*
	 * 功能描述：登录方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:4月29日 15:44
	 */
	@RequestMapping("login")
	public Member login(String account, String password,HttpSession session) {
		Date date = new Date();
		SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Member member = this.memberService.Login(account, password);
		if(member!=null) {
			session.setAttribute("account", account);
			session.setAttribute("simp", simp.format(date));
		}
		return member;
	}
	
	/*
	 * 功能描述：注册方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:4月29日 15:44
	 */
	@RequestMapping("Register")
	public int Register(Member member) {
		member.setInfoId(1);
		member.setSalt("严值加密");
		return this.memberService.Registers(member);
		
	}
}
