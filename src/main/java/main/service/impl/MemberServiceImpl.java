package main.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.MemberMapper;
import main.domin.Member;
import main.service.MemberService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;

	/*
	 * 功能描述：登录方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:4月28日 14:22
	 */
	@Override
	public Member Login(String account, String password) {
		Example example = new Example(Member.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("account", account);
		criteria.andEqualTo("password", password);
		Member member = this.memberMapper.selectOneByExample(example);
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
	@Override
	public int Registers(Member member) {
		return this.memberMapper.insertSelective(member);
	}

	/*
	 * 功能描述：修改方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Member
	 * 
	 * @Date:4月29日 15:44
	 */
	@Override
	public int update(Integer id, String account, Character isBlock, String salt, Integer infoId, Character isCancel,
			String password, Date creationTime) {
		Member m = new Member();
		m.setPassword(password);
		m.setAccount(account);
		m.setId(id);
		m.setCreationTime(creationTime);
		m.setInfoId(infoId);
		m.setIsBlock(isBlock);
		m.setSalt(salt);
		m.setPassword(password);
		m.setIsCancel(isCancel);
		m.setCreationTime(creationTime);
		int g = this.memberMapper.updateByPrimaryKey(m);
		System.out.println("g----" + g);
		return g;
	}

	@Override
	public Member queryMember(Integer id) {
		Member member = this.memberMapper.selectByPrimaryKey(id);
		return member;
	}

}
