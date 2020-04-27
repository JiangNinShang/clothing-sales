package main.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善 商品类型表
 */
@SuppressWarnings("all")
@ApiModel("商品类型表")
@Table(name = "tb_commodity_type")
public class Commodity_Type implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 类型名称 */
	@ApiModelProperty("类型名称")
	private int commodity_id;
	/** 上级编号 */
	@ApiModelProperty("上级编号")
	private int type_id;

	public Commodity_Type() {
		// TODO Auto-generated constructor stub
	}

	public Commodity_Type(int id, int commodity_id, int type_id) {
		super();
		this.id = id;
		this.commodity_id = commodity_id;
		this.type_id = type_id;
	}

	@Override
	public String toString() {
		return "Tb_commodityType [id=" + id + ", commodity_id=" + commodity_id + ", type_id=" + type_id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCommodity_id() {
		return commodity_id;
	}

	public void setCommodity_id(int commodity_id) {
		this.commodity_id = commodity_id;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

}
