package domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("会员")
@Table(name = "tb_member")
public class Member implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("账号/手机号")
	private String account;

	@ApiModelProperty("密码")
	private String password;

	@ApiModelProperty("会员详细编号")
	@Column(name = "info_id")
	private Integer infoId;

	@ApiModelProperty("是否注销")
	@Column(name = "is_cancel")
	private Character isCancel;

	@ApiModelProperty("是否拉黑")
	@Column(name = "is_block")
	private Character isBlock;

	@ApiModelProperty("创建时间")
	@Column(name = "creation_time")
	private Date creationTime;

	private MemberInfo memberInfo;

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(Integer id, String account, String password, Integer infoId, Character isCancel, Character isBlock,
			Date creationTime, MemberInfo memberInfo) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.infoId = infoId;
		this.isCancel = isCancel;
		this.isBlock = isBlock;
		this.creationTime = creationTime;
		this.memberInfo = memberInfo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getInfoId() {
		return infoId;
	}

	public void setInfoId(Integer infoId) {
		this.infoId = infoId;
	}

	public Character getIsCancel() {
		return isCancel;
	}

	public void setIsCancel(Character isCancel) {
		this.isCancel = isCancel;
	}

	public Character getIsBlock() {
		return isBlock;
	}

	public void setIsBlock(Character isBlock) {
		this.isBlock = isBlock;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public MemberInfo getMemberInfo() {
		return memberInfo;
	}

	public void setMemberInfo(MemberInfo memberInfo) {
		this.memberInfo = memberInfo;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", account=" + account + ", password=" + password + ", infoId=" + infoId
				+ ", isCancel=" + isCancel + ", isBlock=" + isBlock + ", creationTime=" + creationTime + ", memberInfo="
				+ memberInfo + "]";
	}

}
