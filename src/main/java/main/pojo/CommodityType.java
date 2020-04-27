package main.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善  商品类型表
 */
@SuppressWarnings("all")
@ApiModel(" 商品类型表")
@Table(name = "tb_commodityType")
public class CommodityType implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 类型名称 */
	@ApiModelProperty("类型名称")
	private String type_name;
	/** 上级编号 */
	@ApiModelProperty("上级编号")
	private int superior_id;

	public CommodityType() {
		// TODO Auto-generated constructor stub
	}

	public CommodityType(int id, String type_name, int superior_id) {
		super();
		this.id = id;
		this.type_name = type_name;
		this.superior_id = superior_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public int getSuperior_id() {
		return superior_id;
	}

	public void setSuperior_id(int superior_id) {
		this.superior_id = superior_id;
	}

	@Override
	public String toString() {
		return "Tb_commodityType [id=" + id + ", type_name=" + type_name + ", superior_id=" + superior_id + "]";
	}

}
