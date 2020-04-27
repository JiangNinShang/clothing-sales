package main.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善 角色表
 */
@SuppressWarnings("all")
@ApiModel("角色表")
@Table(name = "tb_role")
public class Role implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 角色名 */
	@ApiModelProperty("角色名")
	private String role_name;
	/** 介绍 */
	@ApiModelProperty("介绍")
	private String introduce;
	/** 创建时间 */
	@ApiModelProperty("创建时间")
	private Date creation_time;

	public Role() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Date getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Date creation_time) {
		this.creation_time = creation_time;
	}

	public Role(int id, String role_name, String introduce, Date creation_time) {
		super();
		this.id = id;
		this.role_name = role_name;
		this.introduce = introduce;
		this.creation_time = creation_time;
	}

	@Override
	public String toString() {
		return "Tb_role [id=" + id + ", role_name=" + role_name + ", introduce=" + introduce + ", creation_time="
				+ creation_time + "]";
	}

}
