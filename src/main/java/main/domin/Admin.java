package main.domin;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("管理员")
@Table(name = "tb_admin")
public class Admin implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("管理员")
	private String admin;

	@ApiModelProperty("用户名")
	private String account;

	@ApiModelProperty("密码")
	private String password;

	private String salt;

	@ApiModelProperty("上次登录时间")
	@Column(name = "last_date")
	private Date lastDate;

	@ApiModelProperty("是否禁用")
	@Column(name = "is_forbidden")
	private String isForbidden;

	@ApiModelProperty("创建时间")
	@Column(name = "creation_time")
	private Date creationTime;

	private Role role;

	public Integer getId() {
		return id;
	}

	public Admin setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getAdmin() {
		return admin;
	}

	public Admin setAdmin(String admin) {
		this.admin = admin;
		return this;
	}

	public String getAccount() {
		return account;
	}

	public Admin setAccount(String account) {
		this.account = account;
		return this;
	}

	public String getPassword() {
		return password;
	}

	public Admin setPassword(String password) {
		this.password = password;
		return this;
	}

	public String getSalt() {
		return salt;
	}

	public Admin setSalt(String salt) {
		this.salt = salt;
		return this;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public Admin setLastDate(Date lastDate) {
		this.lastDate = lastDate;
		return this;
	}

	public String getIsForbidden() {
		return isForbidden;
	}

	public Admin setIsForbidden(String isForbidden) {
		this.isForbidden = isForbidden;
		return this;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public Admin setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
		return this;
	}

	public Role getRole() {
		return role;
	}

	public Admin setRole(Role role) {
		this.role = role;
		return this;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", admin=" + admin + ", account=" + account + ", password=" + password + ", salt="
				+ salt + ", lastDate=" + lastDate + ", isForbidden=" + isForbidden + ", creationTime=" + creationTime
				+ ", role=" + role + "]";
	}

}
