package dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import domain.Role;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface RoleMapper extends Mapper<Role> {

	// 获取所有角色，及对应权限
	@Results({
		@Result(column = "id", property = "id"),
		@Result(column = "role_name", property = "roleName"),
		@Result(column = "introduce", property = "introduce"),
		@Result(column = "creation_time", property = "creationTime"),
		@Result(column = "id", property = "resourceIds",
			many = @Many(select = "com.newer.dao.ResourceMapper.gainResourcesByRoleId"))
	})
	@Select("SELECT * FROM tb_role")
	public List<Role> gainRoleAll();

	@Results({
		@Result(column = "id", property = "id"),
		@Result(column = "role_name", property = "roleName"),
		@Result(column = "introduce", property = "introduce"),
		@Result(column = "creation_time", property = "creationTime")
	})
	@Select("SELECT ro.id, ro.role_name, ro.introduce, ro.creation_time FROM tb_role ro INNER JOIN tb_admin$role ar ON ro.id = ar.role_id WHERE ar.admin_id = #{adminId}")
	public Role gainRoleByAdminId(Integer adminId);
	
	// 根据角色编号，移除管理员角色关联
	@Delete("DELETE FROM tb_admin$role WHERE role_id = #{roleId}")
	public Integer deleteRole$AdminById(Integer roleId);

	// 根据角色编号，移除角色权限关联
	@Delete("DELETE FROM tb_role$resource WHERE role_id = #{roleId}")
	public Integer deleteRole$ResourceById(Integer roleId);

//	// 添加角色权限关联
//	@Insert("INSERT INTO tb_role$resource(role_id,resource_id) VALUES(#{roleId},#{resourceId})")
//	public Integer insertRole$Resource(RoleResourceDto dto);

}
