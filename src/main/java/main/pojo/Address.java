package main.pojo;

import java.io.Serializable;

import javax.persistence.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善  地址表
 */
@SuppressWarnings("all")
@ApiModel("地址表")
@Table(name = "tb_address")
public class Address implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	/** 地址编号 */
	@ApiModelProperty("地址编号")
	private int id;
	/** 会员编号 */
	@ApiModelProperty("会员编号")
	private int member_id;
	/** 省 */
	@ApiModelProperty("省")
	private String province;
	/** 市 */
	@ApiModelProperty("市")
	private String city;
	/** 会员编号 */
	@ApiModelProperty("区")
	private String district;
	/** 会员编号 */
	@ApiModelProperty("街道地址")
	private String address;
	/** 会员编号 */
	@ApiModelProperty("收货人姓名")
	private String consignee_name;
	/** 会员编号 */
	@ApiModelProperty("手机号")
	private String mobile;
	/** 会员编号 */
	@ApiModelProperty("状态")
	private char state;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int id, int member_id, String province, String city, String district, String address,
			String consignee_name, String mobile, char state) {
		super();
		this.id = id;
		this.member_id = member_id;
		this.province = province;
		this.city = city;
		this.district = district;
		this.address = address;
		this.consignee_name = consignee_name;
		this.mobile = mobile;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
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

	public String getConsignee_name() {
		return consignee_name;
	}

	public void setConsignee_name(String consignee_name) {
		this.consignee_name = consignee_name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public char getState() {
		return state;
	}

	public void setState(char state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "TB_address [id=" + id + ", member_id=" + member_id + ", province=" + province + ", city=" + city
				+ ", district=" + district + ", address=" + address + ", consignee_name=" + consignee_name + ", mobile="
				+ mobile + ", state=" + state + "]";
	}
	
}
