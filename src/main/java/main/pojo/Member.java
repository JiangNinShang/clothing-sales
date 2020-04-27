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
 * @author 蒋宁善 会员表
 */
@SuppressWarnings("all")
@ApiModel("会员表")
@Table(name = "tb_member")
public class Member implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 账号/手机号 */
	@ApiModelProperty("账号/手机号")
	private String account;
	/** 密码 */
	@ApiModelProperty("密码")
	private String password;
	/** 会员详细编号 */
	@ApiModelProperty("会员详细编号")
	private int info_id;
	/** 是否注销 */
	@ApiModelProperty("是否注销")
	private char is_cancel;
	/** 创建时间 */
	@ApiModelProperty("创建时间")
	private Date creation_time;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tb_member [id=" + id + ", account=" + account + ", password=" + password + ", info_id=" + info_id
				+ ", is_cancel=" + is_cancel + ", creation_time=" + creation_time + "]";
	}

	public Member(int id, String account, String password, int info_id, char is_cancel, Date creation_time) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.info_id = info_id;
		this.is_cancel = is_cancel;
		this.creation_time = creation_time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getInfo_id() {
		return info_id;
	}

	public void setInfo_id(int info_id) {
		this.info_id = info_id;
	}

	public char getIs_cancel() {
		return is_cancel;
	}

	public void setIs_cancel(char is_cancel) {
		this.is_cancel = is_cancel;
	}

	public Date getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Date creation_time) {
		this.creation_time = creation_time;
	}

}
