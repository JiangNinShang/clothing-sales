package dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import domain.Resource;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface ResourceMapper extends Mapper<Resource> {

	// 根据管理员编号获取权限
	@Select("SELECT re.code FROM tb_resource re INNER JOIN tb_role$resource rr ON re.id = rr.resource_id WHERE rr.role_id = (SELECT ar.role_id FROM tb_admin ad INNER JOIN tb_admin$role ar ON ad.id = ar.admin_id WHERE ad.id = #{adminId})")
	public String[] gainResourcesByAdminId(Integer adminId);

	@Select("SELECT re.id FROM tb_resource re INNER JOIN tb_role$resource rr ON re.id = rr.resource_id WHERE rr.role_id = #{roleId}")
	public Integer[] gainResourcesByRoleId(Integer roleId);

}
