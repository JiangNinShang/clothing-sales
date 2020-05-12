package main.domin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("会员详细")
@Table(name = "tb_memberInfo")
public class MemberInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("头像")
	@Column(name = "head_image")
	private String headImage;

	@ApiModelProperty("会员名")
	@Column(name = "member_name")
	private String memberName;

	@ApiModelProperty("性别")
	private String sex;

	@ApiModelProperty("爱好")
	private String hobby;

	@ApiModelProperty("介绍")
	private String introduce;

	public MemberInfo() {
		// TODO Auto-generated constructor stub
	}

	public MemberInfo(Integer id, String headImage, String memberName, String sex, String hobby, String introduce) {
		super();
		this.id = id;
		this.headImage = headImage;
		this.memberName = memberName;
		this.sex = sex;
		this.hobby = hobby;
		this.introduce = introduce;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHeadImage() {
		return headImage;
	}

	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
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
		return "MemberInfo [id=" + id + ", headImage=" + headImage + ", memberName=" + memberName + ", sex=" + sex
				+ ", hobby=" + hobby + ", introduce=" + introduce + "]";
	}

}
