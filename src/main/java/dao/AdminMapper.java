package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import domain.Admin;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface AdminMapper extends Mapper<Admin> {

	// 获取所有管理员及角色信息
	@Results({ 
		@Result(column = "id", property = "id"),
		@Result(column = "admin", property = "admin"),
		@Result(column = "account", property = "account"),
		@Result(column = "password", property = "password"),
		@Result(column = "last_date", property = "lastDate"),
		@Result(column = "is_forbidden", property = "isForbidden"),
		@Result(column = "creation_time", property = "creationTime"),
		@Result(column = "id", property = "role",
			one = @One(select = "com.newer.dao.RoleMapper.gainRoleByAdminId"))
	})
	@Select("SELECT * FROM tb_admin")
	public List<Admin> gainAdminAll();

	// 根据管理员编号，移除管理员角色关联
	@Delete("DELETE FROM tb_admin$role WHERE admin_id = #{adminId}")
	public Integer deleteAdmin$RoleById(Integer adminId);

//	// 添加管理员角色关联
//	@Insert("INSERT INTO tb_admin$role(admin_id,role_id) VALUES(#{adminId},#{roleId})")
//	public Integer insertAdmin$Role(AdminRoleDto dto);

}
