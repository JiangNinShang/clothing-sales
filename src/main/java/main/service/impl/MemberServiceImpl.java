package main.service.impl;

import java.util.List;

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
	public boolean Login(String account, String password) {
		Example example = new Example(Member.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("account", account);
		criteria.andEqualTo("password", password);
		Member member = this.memberMapper.selectOneByExample(example);
		if (member != null)
			return true;
		return false;
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
	public boolean Register(Member member) {
		return this.memberMapper.insert(member) > 0 ? true : false;
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
	public boolean update(Member member) {
		return this.memberMapper.updateByPrimaryKey(member) > 0 ? true : false;
	}
}
