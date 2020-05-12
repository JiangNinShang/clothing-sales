package main.dto;

public class RoleResourceDto {

	private Integer roleId;

	private Integer resourceId;

	public Integer getRoleId() {
		return roleId;
	}

	public RoleResourceDto setRoleId(Integer roleId) {
		this.roleId = roleId;
		return this;
	}

	public Integer getResourceId() {
		return resourceId;
	}

	public RoleResourceDto setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
		return this;
	}

}
