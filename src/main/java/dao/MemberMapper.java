package dao;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import domain.Member;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface MemberMapper extends Mapper<Member> {

	// 获取所有会员及会员详细信息
	@Results({ 
		@Result(column = "id", property = "id"),
		@Result(column = "account", property = "account"),
		@Result(column = "password", property = "password"),
		@Result(column = "info_id", property = "infoId"),
		@Result(column = "is_cancel", property = "isCancel"),
		@Result(column = "is_block", property = "isBlock"),
		@Result(column = "creation_time", property = "creationTime"),
		@Result(column = "info_id", property = "memberInfo",
				one = @One(select = "com.newer.dao.MemberInfoMapper.gainMemberInfoById"))
	})
	@Select("SELECT * FROM tb_member")
	public List<Member> gainMemberAll();

}
