package main.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善 订单明细表
 */
@SuppressWarnings("all")
@ApiModel("订单明细表")
@Table(name = "tb_orderInfo")
public class OrderInfo implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 订单编号 */
	@ApiModelProperty("订单编号")
	private int order_id;
	/** 商品编号 */
	@ApiModelProperty("商品编号")
	private int commodity_id;
	/** 款式编号 */
	@ApiModelProperty("款式编号")
	private int disign_id;
	/** 尺码 */
	@ApiModelProperty("尺码")
	private String size;
	/** 数量 */
	@ApiModelProperty("数量")
	private int count;

	public OrderInfo() {
		// TODO Auto-generated constructor stub
	}

	public OrderInfo(int id, int order_id, int commodity_id, int disign_id, String size, int count) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.commodity_id = commodity_id;
		this.disign_id = disign_id;
		this.size = size;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Tb_orderInfo [id=" + id + ", order_id=" + order_id + ", commodity_id=" + commodity_id + ", disign_id="
				+ disign_id + ", size=" + size + ", count=" + count + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCommodity_id() {
		return commodity_id;
	}

	public void setCommodity_id(int commodity_id) {
		this.commodity_id = commodity_id;
	}

	public int getDisign_id() {
		return disign_id;
	}

	public void setDisign_id(int disign_id) {
		this.disign_id = disign_id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
