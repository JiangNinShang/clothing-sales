package main.dto;

public class AdminRoleDto {

	private Integer adminId;

	private Integer roleId;

	public Integer getAdminId() {
		return adminId;
	}

	public AdminRoleDto setAdminId(Integer adminId) {
		this.adminId = adminId;
		return this;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public AdminRoleDto setRoleId(Integer roleId) {
		this.roleId = roleId;
		return this;
	}

}
