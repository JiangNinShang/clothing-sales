package main.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善 角色资源关联表
 */
@SuppressWarnings("all")
@ApiModel("角色资源关联表")
@Table(name = "tb_role_resource")
public class Role_resource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 管理员编号 */
	@ApiModelProperty("管理员编号")
	private int admin_id;
	/** 角色编号 */
	@ApiModelProperty("角色编号")
	private int role_id;

	public Role_resource() {
		// TODO Auto-generated constructor stub
	}

	public Role_resource(int id, int admin_id, int role_id) {
		super();
		this.id = id;
		this.admin_id = admin_id;
		this.role_id = role_id;
	}

	@Override
	public String toString() {
		return "Tb_role_resource [id=" + id + ", admin_id=" + admin_id + ", role_id=" + role_id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

}
