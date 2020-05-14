package main.domin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品发布")
@Table(name = "tb_commodityRelease")
public class CommodityRelease implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("代码")
	private String code;

	@ApiModelProperty("图片")
	private String image;

	@ApiModelProperty("内容")
	private String Integerroduce;

	@ApiModelProperty("商品编号/链接")
	@Column(name = "commodity_id")
	private Integer commodityId;

	/**
	 * @author 梁淼 
	 */
	private Commodity commodity;
	
	public CommodityRelease() {
		// TODO Auto-generated constructor stub
	}

	public CommodityRelease(Integer id, String code, String image, String Integerroduce, Integer commodityId) {
		super();
		this.id = id;
		this.code = code;
		this.image = image;
		this.Integerroduce = Integerroduce;
		this.commodityId = commodityId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getIntroduce() {
		return Integerroduce;
	}

	public void setIntroduce(String Integerroduce) {
		this.Integerroduce = Integerroduce;
	}

	public Integer getCommodityId() {
		return commodityId;
	}

	public void setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
	}

	
	public Commodity getCommodity() {
		return commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;
	}

	@Override
	public String toString() {
		return "CommodityRelease [id=" + id + ", code=" + code + ", image=" + image + ", Integerroduce=" + Integerroduce
				+ ", commodityId=" + commodityId + "]";
	}

}
