package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;

import domain.Member;
import service.impl.MemberService;

@Controller
@RestController
@RequestMapping("Member")
public class MemberController {
	@Autowired
	private MemberService memberService;

	/*
	 * 功能描述：登录的方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:5月4日 20:21
	 */
	@RequestMapping("Login")
	public String Login(String account, String password, HttpSession session) {
		Date data = new Date();
		SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		boolean bool = this.memberService.Login(account, password);
		if (bool) {
			session.setAttribute("account", account);
			session.setAttribute("simp", simp.format(data));
			return "#";
		} else {
			return "#";
		}

	}

	/*
	 * 功能描述：注册的方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:5月4日 20:32
	 */
	@RequestMapping("Register")
	public String Register(Member member) {
		boolean bool = this.memberService.Register(member);
		if (bool) {
			return "注册成功跳主页面";
		} else {
			return "登录失败就在注册页面";
		}
	}

	/*
	 * 功能描述：修改的方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:5月4日 20:51
	 */
	@RequestMapping("update")
	public String update(Member member) {
		boolean bool = this.memberService.update(member);
		if (bool) {
			return "修改成功跳页面";
		} else {
			return "修改失败就在原页面";
		}
	}

	/*
	 * 功能描述：注销的方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:5月4日 21:00
	 */
	@RequestMapping("logout")
	public String logout(HttpSession session, SessionStatus sessionStatus) {
		session.invalidate();
		sessionStatus.setComplete();
		return "退出到登录页面";
	}

}
