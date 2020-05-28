
package main.web.controller.wang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import main.domin.Member;
import main.service.MemberService;
import main.util.MyConstants;

@RestController
@RequestMapping("Member")
@SessionAttributes(MyConstants.SESSSION_Member)
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
	public Member login(String account, String password, Model model, HttpSession session) {
		Date date = new Date();
		SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Member member = this.memberService.Login(account, password);
		if (member != null) {
			model.addAttribute(MyConstants.SESSSION_Member, member);
			session.setAttribute("simp", simp.format(date));
		}
		return member;
	}

	// 测试session里面的值
	@RequestMapping("logins")
	public Member findSesMember(Model model) {
		Member member = (Member) model.getAttribute(MyConstants.SESSSION_Member);
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

	/*
	 * 功能描述：修改方法
	 * 
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:4月29日 15:44
	 */
	@RequestMapping("update")
	public int update(Integer id, String account, String isBlock, String salt, Integer infoId, String isCancel,
			String password, String creationTime) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		char[] arr1 = isBlock.toCharArray();
		char[] arr2 = isCancel.toCharArray();
		char ch = arr1[0];
		char ch1 = arr2[0];
		Date date = null;
		try {
			date = formatter.parse(creationTime);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return this.memberService.update(id, account, ch, salt, infoId, ch1, password, date);
	}

	/*
	 * 功能描述：根据id查询方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:4月29日 15:44
	 */
	@RequestMapping("query")
	public Member queryById(Integer id) {
		Member member = this.memberService.queryMember(id);
		return member;
	}
	
	/*
	 * 功能描述：根据电话号码查询方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:4月29日 15:44
	 */
	@RequestMapping("queryByAccount")
	public Member queryByAccount(String account) {
		Member member = this.memberService.queryMemberAccount(account);
		return member;
	}
}
