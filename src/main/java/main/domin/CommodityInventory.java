package main.domin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品库存")
@Table(name = "tb_commodityInventory")
public class CommodityInventory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("款式编号")
	private Integer design;

	@ApiModelProperty("尺码")
	private String size;

	@ApiModelProperty("库存")
	private Integer inventory;

	@ApiModelProperty("预定义库存")
	@Column(name = "perdefine_inventory")
	private Integer predefineInventory;

	public CommodityInventory() {
		// TODO Auto-generated constructor stub
	}

	public CommodityInventory(Integer id, Integer design, String size, Integer inventory, Integer predefineInventory) {
		super();
		this.id = id;
		this.design = design;
		this.size = size;
		this.inventory = inventory;
		this.predefineInventory = predefineInventory;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDesign() {
		return design;
	}

	public void setDesign(Integer design) {
		this.design = design;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	public Integer getPredefineInventory() {
		return predefineInventory;
	}

	public void setPredefineInventory(Integer predefineInventory) {
		this.predefineInventory = predefineInventory;
	}

	@Override
	public String toString() {
		return "CommodityInventory [id=" + id + ", design=" + design + ", size=" + size + ", inventory=" + inventory
				+ ", predefineInventory=" + predefineInventory + "]";
	}

}
