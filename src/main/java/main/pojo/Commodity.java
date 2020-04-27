package main.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善 商品表
 */
@SuppressWarnings("all")
@ApiModel("商品表")
@Table(name = "tb_commodity")
public class Commodity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 商品图片 */
	@ApiModelProperty("商品图片")
	private String commodity_image;
	/** 商品名称 */
	@ApiModelProperty("商品名称")
	private String commodity_name;
	/** 价格 */
	@ApiModelProperty("价格")
	private double price;
	/** 折扣 */
	@ApiModelProperty("折扣")
	private float discount;
	/** 介绍 */
	@ApiModelProperty("介绍")
	private String introduce;
	/** 是否下架 */
	@ApiModelProperty("是否下架")
	private char is_shelves;
	/** 发布时间 */
	@ApiModelProperty("发布时间")
	private Date release_time;

	public Commodity() {
		// TODO Auto-generated constructor stub
	}

	public Commodity(int id, String commodity_image, String commodity_name, double price, float discount,
			String introduce, char is_shelves, Date release_time) {
		super();
		this.id = id;
		this.commodity_image = commodity_image;
		this.commodity_name = commodity_name;
		this.price = price;
		this.discount = discount;
		this.introduce = introduce;
		this.is_shelves = is_shelves;
		this.release_time = release_time;
	}

	@Override
	public String toString() {
		return "Tb_commodity [id=" + id + ", commodity_image=" + commodity_image + ", commodity_name=" + commodity_name
				+ ", price=" + price + ", discount=" + discount + ", introduce=" + introduce + ", is_shelves="
				+ is_shelves + ", release_time=" + release_time + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommodity_image() {
		return commodity_image;
	}

	public void setCommodity_image(String commodity_image) {
		this.commodity_image = commodity_image;
	}

	public String getCommodity_name() {
		return commodity_name;
	}

	public void setCommodity_name(String commodity_name) {
		this.commodity_name = commodity_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public char getIs_shelves() {
		return is_shelves;
	}

	public void setIs_shelves(char is_shelves) {
		this.is_shelves = is_shelves;
	}

	public Date getRelease_time() {
		return release_time;
	}

	public void setRelease_time(Date release_time) {
		this.release_time = release_time;
	}

}
