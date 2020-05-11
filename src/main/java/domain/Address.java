package domain;

import java.io.Serializable;

import javax.persistence.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("地址")
@Table(name = "tb_address")
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("地址编号")
	private Integer id;

	@ApiModelProperty("会员编号")
	@Column(name = "member_id")
	private Integer memberId;

	@ApiModelProperty("省")
	private String province;

	@ApiModelProperty("市")
	private String city;

	@ApiModelProperty("区")
	private String district;

	@ApiModelProperty("街道地址")
	private String address;

	@ApiModelProperty("收货人姓名")
	@Column(name = "consignee_name")
	private String consigneeName;

	@ApiModelProperty("手机号")
	private String mobile;

	@ApiModelProperty("状态")
	private Character state;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(Integer id, Integer memberId, String province, String city, String district, String address,
			String consigneeName, String mobile, Character state) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.province = province;
		this.city = city;
		this.district = district;
		this.address = address;
		this.consigneeName = consigneeName;
		this.mobile = mobile;
		this.state = state;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getConsigneeName() {
		return consigneeName;
	}

	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Character getState() {
		return state;
	}

	public void setState(Character state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "TB_address [id=" + id + ", memberId=" + memberId + ", province=" + province + ", city=" + city
				+ ", district=" + district + ", address=" + address + ", consigneeName=" + consigneeName + ", mobile="
				+ mobile + ", state=" + state + "]";
	}

}
