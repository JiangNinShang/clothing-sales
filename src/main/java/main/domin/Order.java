package main.domin;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("订单")
@Table(name = "tb_order")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("会员编号")
	@Column(name = "member_id")
	private Integer memberId;

	@ApiModelProperty("订单金额")
	private Character total;

	@ApiModelProperty("地址编号")
	@Column(name = "address_id")
	private Integer addressId;

	@ApiModelProperty("订单描述")
	@Column(name = "order_description")
	private String orderDescription;

	@ApiModelProperty("订单状态")
	@Column(name = "order_state")
	private Character orderState;

	@ApiModelProperty("创建时间")
	@Column(name = "creation_time")
	private Date creationTime;

	@ApiModelProperty("结算时间")
	@Column(name = "sttle_time")
	private Date settleTime;

	@ApiModelProperty("完成时间")
	@Column(name = "accomplish_time")
	private Date accomplishTime;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Integer id, Integer memberId, Character total, Integer addressId, String orderDescription, Character orderState,
			Date creationTime, Date settleTime, Date accomplishTime) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.total = total;
		this.addressId = addressId;
		this.orderDescription = orderDescription;
		this.orderState = orderState;
		this.creationTime = creationTime;
		this.settleTime = settleTime;
		this.accomplishTime = accomplishTime;
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

	public Character getTotal() {
		return total;
	}

	public void setTotal(Character total) {
		this.total = total;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getOrderDescription() {
		return orderDescription;
	}

	public void setOrderDescription(String orderDescription) {
		this.orderDescription = orderDescription;
	}

	public Character getOrderState() {
		return orderState;
	}

	public void setOrderState(Character orderState) {
		this.orderState = orderState;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getSettleTime() {
		return settleTime;
	}

	public void setSettleTime(Date settleTime) {
		this.settleTime = settleTime;
	}

	public Date getAccomplishTime() {
		return accomplishTime;
	}

	public void setAccomplishTime(Date accomplishTime) {
		this.accomplishTime = accomplishTime;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", memberId=" + memberId + ", total=" + total + ", addressId=" + addressId
				+ ", orderDescription=" + orderDescription + ", orderState=" + orderState + ", creationTime="
				+ creationTime + ", settleTime=" + settleTime + ", accomplishTime=" + accomplishTime + "]";
	}

}
