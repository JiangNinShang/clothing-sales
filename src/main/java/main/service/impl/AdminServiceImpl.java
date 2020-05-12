package main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.AdminMapper;
import main.dao.ResourceMapper;
import main.dao.RoleMapper;
import main.domin.Admin;
import main.domin.Role;
import main.dto.AdminRoleDto;
import main.dto.RoleResourceDto;
import main.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;

	@Autowired
	private RoleMapper roleMapper;

	@Autowired
	private ResourceMapper resourceMapper;

	@Override
	public Admin findAdminByAccount(String account) {
		return this.adminMapper.selectOne(new Admin().setAccount(account));
	}

	@Override
	public String[] getResourceCodes(Integer adminId) {
		return this.resourceMapper.gainResourcesByAdminId(adminId);
	}

	@Override
	public List<Role> getRoles() {
		return this.roleMapper.gainRoleAll();
	}

	@Override
	public boolean insertRole(Role role) {
		return this.roleMapper.insertSelective(role) == 1 ? true : false;
	}

	@Override
	public boolean updateRole(Role role) {
		if (role.getResourceIds() != null && !"[1]".equals(role.getResourceIds().toString())) {
			this.roleMapper.deleteRole$ResourceById(role.getId());

			for (int i = 0; i < role.getResourceIds().length; i++) {
				this.roleMapper.insertRole$Resource(
						new RoleResourceDto().setRoleId(role.getId()).setResourceId(role.getResourceIds()[i]));
			}
		}

		return this.roleMapper.updateByPrimaryKeySelective(role) == 1 ? true : false;
	}

	@Override
	public boolean deleteRole(Integer roleId) {
		this.roleMapper.deleteRole$AdminById(roleId);
		this.roleMapper.deleteRole$ResourceById(roleId);
		return this.roleMapper.deleteByPrimaryKey(roleId) == 1 ? true : false;
	}

	@Override
	public List<Admin> getAdminAll() {
		return this.adminMapper.gainAdminAll();
	}

	@Override
	public boolean permissionAssignment(Integer adminId, Integer roleId) {
		boolean bool = this.adminMapper.deleteAdmin$RoleById(adminId) == 1 ? true : false;

		if (roleId != 0) {
			this.adminMapper.insertAdmin$Role(new AdminRoleDto().setAdminId(adminId).setRoleId(roleId));
		}

		return bool;
	}

	@Override
	public boolean insertAdmin(Admin admin) {
		return this.adminMapper.insertSelective(admin) == 1 ? true : false;
	}

	@Override
	public boolean isForbiddenAdmin(Admin admin) {
		return this.adminMapper.updateByPrimaryKeySelective(admin) == 1 ? true : false;
	}

	@Override
	public boolean deleteAdmin(Integer adminId) {
		this.adminMapper.deleteAdmin$RoleById(adminId);
		return this.adminMapper.deleteByPrimaryKey(adminId) == 1 ? true : false;
	}

}
