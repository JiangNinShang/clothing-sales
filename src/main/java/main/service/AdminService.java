package main.service;

import java.util.List;

import main.domin.Admin;
import main.domin.Role;


public interface AdminService {

	public Admin findAdminByAccount(String account);

	public String[] getResourceCodes(Integer adminId);

	public List<Role> getRoles();

	public boolean insertRole(Role role);

	public boolean updateRole(Role role);

	public boolean deleteRole(Integer roleId);

	public List<Admin> getAdminAll();

	public boolean permissionAssignment(Integer adminId, Integer roleId);

	public boolean insertAdmin(Admin admin);

	public boolean isForbiddenAdmin(Admin admin);

	public boolean deleteAdmin(Integer adminId);

}
