package main.domin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品款式")
@Table(name = "tb_commodityDesign")
public class CommodityDesign implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("商品编号")
	@Column(name = "commodity_id")
	private Integer commodityId;

	@ApiModelProperty("款式图片")
	@Column(name = "design_image")
	private String designImage;

	@ApiModelProperty("款式")
	private String design;

	public CommodityDesign() {
		// TODO Auto-generated constructor stub
	}

	public CommodityDesign(Integer id, Integer commodityId, String designImage, String design) {
		super();
		this.id = id;
		this.commodityId = commodityId;
		this.designImage = designImage;
		this.design = design;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}

	public String getDesignImage() {
		return designImage;
	}

	public void setDesignImage(String designImage) {
		this.designImage = designImage;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	@Override
	public String toString() {
		return "CommodityDesign [id=" + id + ", commodityId=" + commodityId + ", designImage=" + designImage
				+ ", design=" + design + "]";
	}

}
