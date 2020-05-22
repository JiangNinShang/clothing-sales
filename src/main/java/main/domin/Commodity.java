package main.domin;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品")
@Table(name = "tb_commodity")
public class Commodity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("商品图片")
	@Column(name = "commodity_image")
	private String commodityImage;

	@ApiModelProperty("商品名称")
	@Column(name = "commodity_name")
	private String commodityName;

	@ApiModelProperty("价格")
	private Double price;

	@ApiModelProperty("折扣")
	private Float discount;

	@ApiModelProperty("介绍")
	private String introduce;

	@ApiModelProperty("是否下架")
	@Column(name = "is_shelves")
	private Character isShelves;

	@ApiModelProperty("发布时间")
	@Column(name = "release_time")
	private Date releaseTime;

	public Commodity() {
		// TODO Auto-generated constructor stub
	}

	public Commodity(Integer id, String commodityImage, String commodityName, Double price, Float discount,
			String introduce, Character isShelves, Date releaseTime) {
		super();
		this.id = id;
		this.commodityImage = commodityImage;
		this.commodityName = commodityName;
		this.price = price;
		this.discount = discount;
		this.introduce = introduce;
		this.isShelves = isShelves;
		this.releaseTime = releaseTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommodityImage() {
		return commodityImage;
	}

	public void setCommodityImage(String commodityImage) {
		this.commodityImage = commodityImage;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Character getIsShelves() {
		return isShelves;
	}

	public void setIsShelves(Character isShelves) {
		this.isShelves = isShelves;
	}

	public Date getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}

	@Override
	public String toString() {
		return "Commodity [id=" + id + ", commodityImage=" + commodityImage + ", commodityName=" + commodityName
				+ ", price=" + price + ", discount=" + discount + ", introduce=" + introduce + ", isShelves="
				+ isShelves + ", releaseTime=" + releaseTime + "]";
	}
	

	/*
	 * 刘欢欢
	 * 折扣价计算
	 * */
	public int getZhekoujia() {
		return (int)(this.price*this.discount);
	}
}
