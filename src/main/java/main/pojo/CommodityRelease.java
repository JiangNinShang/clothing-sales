package main.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善 商品发布表
 */
@SuppressWarnings("all")
@ApiModel("商品发布表")
@Table(name = "tb_commodityRelease")
public class CommodityRelease implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 代码 */
	@ApiModelProperty("代码")
	private String code;
	/** 图片 */
	@ApiModelProperty("图片")
	private String image;
	/** 内容 */
	@ApiModelProperty("内容")
	private String introduce;
	/** 商品编号/链接 */
	@ApiModelProperty("商品编号/链接")
	private int commodity_id;

	public CommodityRelease() {
		// TODO Auto-generated constructor stub
	}

	public CommodityRelease(int id, String code, String image, String introduce, int commodity_id) {
		super();
		this.id = id;
		this.code = code;
		this.image = image;
		this.introduce = introduce;
		this.commodity_id = commodity_id;
	}

	@Override
	public String toString() {
		return "Tb_commodityRelease [id=" + id + ", code=" + code + ", image=" + image + ", introduce=" + introduce
				+ ", commodity_id=" + commodity_id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public int getCommodity_id() {
		return commodity_id;
	}

	public void setCommodity_id(int commodity_id) {
		this.commodity_id = commodity_id;
	}

}
