package dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import domain.MemberInfo;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface MemberInfoMapper extends Mapper<MemberInfo> {

	@Results({
		@Result(column = "id", property = "id"),
		@Result(column = "head_image", property = "headImage"),
		@Result(column = "member_name", property = "memberName"),
		@Result(column = "sex", property = "sex"),
		@Result(column = "hobby", property = "hobby"),
		@Result(column = "introduce", property = "introduce")
	})
	@Select("SELECT * FROM tb_memberInfo WHERE id = #{infoId}")
	public MemberInfo gainMemberInfoById(Integer infoId);

}
