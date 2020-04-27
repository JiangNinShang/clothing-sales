package main.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善  会员详细表
 */
@SuppressWarnings("all")
@ApiModel(" 会员详细表")
@Table(name = "tb_memberInfo")
public class MemberInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 头像 */
	@ApiModelProperty("头像")
	private String head_image;
	/** 会员名 */
	@ApiModelProperty("会员名")
	private String member_name;
	/** 性别 */
	@ApiModelProperty("性别")
	private String sex;
	/** 爱好*/
	@ApiModelProperty("爱好码")
	private String hobby;
	/** 介绍 */
	@ApiModelProperty("介绍")
	private String introduce;

	public MemberInfo() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHead_image() {
		return head_image;
	}

	public void setHead_image(String head_image) {
		this.head_image = head_image;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	@Override
	public String toString() {
		return "Tb_memberInfo [id=" + id + ", head_image=" + head_image + ", member_name=" + member_name + ", sex="
				+ sex + ", hobby=" + hobby + ", introduce=" + introduce + "]";
	}

	public MemberInfo(int id, String head_image, String member_name, String sex, String hobby, String introduce) {
		super();
		this.id = id;
		this.head_image = head_image;
		this.member_name = member_name;
		this.sex = sex;
		this.hobby = hobby;
		this.introduce = introduce;
	}

}
