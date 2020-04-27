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
 * @author 蒋宁善 订单表
 */
@SuppressWarnings("all")
@ApiModel("订单表")
@Table(name = "tb_order")
public class Order implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 会员编号 */
	@ApiModelProperty("会员编号")
	private int member_id;
	/** 订单金额 */
	@ApiModelProperty("订单金额")
	private double total;
	/** 地址编号 */
	@ApiModelProperty("地址编号")
	private int address_id;
	/** 订单描述 */
	@ApiModelProperty("订单描述")
	private String order_description;
	/** 订单状态 */
	@ApiModelProperty("订单状态")
	private char order_state;
	/** 创建时间 */
	@ApiModelProperty("创建时间")
	private Date creation_time;
	/** 结算时间 */
	@ApiModelProperty("结算时间")
	private Date settle_time;
	/** 完成时间 */
	@ApiModelProperty("完成时间")
	private Date accomplish_time;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(int id, int member_id, double total, int address_id, String order_description, char order_state,
			Date creation_time, Date settle_time, Date accomplish_time) {
		super();
		this.id = id;
		this.member_id = member_id;
		this.total = total;
		this.address_id = address_id;
		this.order_description = order_description;
		this.order_state = order_state;
		this.creation_time = creation_time;
		this.settle_time = settle_time;
		this.accomplish_time = accomplish_time;
	}

	@Override
	public String toString() {
		return "Tb_order [id=" + id + ", member_id=" + member_id + ", total=" + total + ", address_id=" + address_id
				+ ", order_description=" + order_description + ", order_state=" + order_state + ", creation_time="
				+ creation_time + ", settle_time=" + settle_time + ", accomplish_time=" + accomplish_time + "]";
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

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getOrder_description() {
		return order_description;
	}

	public void setOrder_description(String order_description) {
		this.order_description = order_description;
	}

	public char getOrder_state() {
		return order_state;
	}

	public void setOrder_state(char order_state) {
		this.order_state = order_state;
	}

	public Date getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Date creation_time) {
		this.creation_time = creation_time;
	}

	public Date getSettle_time() {
		return settle_time;
	}

	public void setSettle_time(Date settle_time) {
		this.settle_time = settle_time;
	}

	public Date getAccomplish_time() {
		return accomplish_time;
	}

	public void setAccomplish_time(Date accomplish_time) {
		this.accomplish_time = accomplish_time;
	}

}
