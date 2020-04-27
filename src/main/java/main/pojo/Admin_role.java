package main.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善 管理员资源表
 */
@SuppressWarnings("all")
@ApiModel("管理员资源表")
@Table(name = "tb_admin_role")
public class Admin_role implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 角色编号 */
	@ApiModelProperty("角色编号")
	private int role_id;
	/** 资源编号 */
	@ApiModelProperty("资源编号")
	private int resource_id;

	public Admin_role() {
		// TODO Auto-generated constructor stub
	}

	public Admin_role(int id, int role_id, int resource_id) {
		super();
		this.id = id;
		this.role_id = role_id;
		this.resource_id = resource_id;
	}

	@Override
	public String toString() {
		return "Tb_admin_role [id=" + id + ", role_id=" + role_id + ", resource_id=" + resource_id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getResource_id() {
		return resource_id;
	}

	public void setResource_id(int resource_id) {
		this.resource_id = resource_id;
	}

}
