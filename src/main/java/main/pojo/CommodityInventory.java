package main.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善 商品库存表
 */
@SuppressWarnings("all")
@ApiModel("商品库存表")
@Table(name = "tb_commodityInventory")
public class CommodityInventory implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 款式编号 */
	@ApiModelProperty("款式编号")
	private int design;
	/** 尺码 */
	@ApiModelProperty("尺码")
	private String size;
	/** 库存 */
	@ApiModelProperty("库存")
	private int inventory;

	public CommodityInventory() {
		// TODO Auto-generated constructor stub
	}

	public CommodityInventory(int id, int design, String size, int inventory) {
		super();
		this.id = id;
		this.design = design;
		this.size = size;
		this.inventory = inventory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDesign() {
		return design;
	}

	public void setDesign(int design) {
		this.design = design;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	@Override
	public String toString() {
		return "Tb_commodityInventory [id=" + id + ", design=" + design + ", size=" + size + ", inventory=" + inventory
				+ "]";
	}

}
