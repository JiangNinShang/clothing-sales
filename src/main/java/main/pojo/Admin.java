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
 * @author 蒋宁善  管理员表
 */
@SuppressWarnings("all")
@ApiModel("管理员表")
@Table(name = "tb_admin")
public class Admin implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 管理员 */
	@ApiModelProperty("管理员")
	private String admin;
	/** 账号 */
	@ApiModelProperty("账号")
	private String account;
	/** 密码 */
	@ApiModelProperty("密码")
	private String password;
	/** 上次登录时间 */
	@ApiModelProperty("上次登录时间")
	private Date last_date;
	/** 是否禁用 */
	@ApiModelProperty("是否禁用")
	private char is_forbidden;
	/** 创建时间 */
	@ApiModelProperty("创建时间")
	private Date creation_time;

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String admin, String account, String password, Date last_date, char is_forbidden,
			Date creation_time) {
		super();
		this.id = id;
		this.admin = admin;
		this.account = account;
		this.password = password;
		this.last_date = last_date;
		this.is_forbidden = is_forbidden;
		this.creation_time = creation_time;
	}

	@Override
	public String toString() {
		return "Tb_admin [id=" + id + ", admin=" + admin + ", account=" + account + ", password=" + password
				+ ", last_date=" + last_date + ", is_forbidden=" + is_forbidden + ", creation_time=" + creation_time
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLast_date() {
		return last_date;
	}

	public void setLast_date(Date last_date) {
		this.last_date = last_date;
	}

	public char getIs_forbidden() {
		return is_forbidden;
	}

	public void setIs_forbidden(char is_forbidden) {
		this.is_forbidden = is_forbidden;
	}

	public Date getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Date creation_time) {
		this.creation_time = creation_time;
	}

}
