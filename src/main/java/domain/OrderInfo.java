package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("订单明细")
@Table(name = "tb_orderInfo")
public class OrderInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("订单编号")
	@Column(name = "order_id")
	private Integer orderId;

	@ApiModelProperty("商品编号")
	@Column(name = "commodity_id")
	private Integer commodityId;

	@ApiModelProperty("款式编号")
	@Column(name = "disign_id")
	private Integer disignId;

	@ApiModelProperty("尺码")
	private String size;

	@ApiModelProperty("数量")
	private Integer count;

	public OrderInfo() {
		// TODO Auto-generated constructor stub
	}

	public OrderInfo(Integer id, Integer orderId, Integer commodityId, Integer disignId, String size, Integer count) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.commodityId = commodityId;
		this.disignId = disignId;
		this.size = size;
		this.count = count;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}

	public Integer getDisignId() {
		return disignId;
	}

	public void setDisignId(Integer disignId) {
		this.disignId = disignId;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", orderId=" + orderId + ", commodityId=" + commodityId + ", disignId="
				+ disignId + ", size=" + size + ", count=" + count + "]";
	}

}
