package main.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善 商品款式表
 */
@SuppressWarnings("all")
@ApiModel("商品款式表")
@Table(name = "tb_commodityDesign")
public class CommodityDesign implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 商品编号 */
	@ApiModelProperty("商品编号")
	private int commodity_id;
	/** 款式图片 */
	@ApiModelProperty("款式图片")
	private String design_image;
	/** 款式 */
	@ApiModelProperty("款式")
	private String design;

	public CommodityDesign() {
		// TODO Auto-generated constructor stub
	}

	public CommodityDesign(int id, int commodity_id, String design_image, String design) {
		super();
		this.id = id;
		this.commodity_id = commodity_id;
		this.design_image = design_image;
		this.design = design;
	}

	@Override
	public String toString() {
		return "Tb_commodityDesign [id=" + id + ", commodity_id=" + commodity_id + ", design_image=" + design_image
				+ ", design=" + design + "]";
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

	public String getDesign_image() {
		return design_image;
	}

	public void setDesign_image(String design_image) {
		this.design_image = design_image;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

}
