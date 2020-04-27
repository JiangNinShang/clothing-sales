package main.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善 广告发布表
 */
@SuppressWarnings("all")
@ApiModel("广告发布表")
@Table(name = "tb_advertisingRelease")
public class AdvertisingRelease implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 图片 */
	@ApiModelProperty("图片")
	private String image;
	/** 广告链接 */
	@ApiModelProperty("广告链接")
	private String advertising_links;
	/** 广告金额 */
	@ApiModelProperty("广告金额")
	private double advertising_money;
	/** 优先级 */
	@ApiModelProperty("优先级")
	private char priority;
	/** 是否禁用 */
	@ApiModelProperty("是否禁用")
	private char is_foridden;

	public AdvertisingRelease() {
		// TODO Auto-generated constructor stub
	}

	public AdvertisingRelease(int id, String image, String advertising_links, double advertising_money,
			char priority, char is_foridden) {
		super();
		this.id = id;
		this.image = image;
		this.advertising_links = advertising_links;
		this.advertising_money = advertising_money;
		this.priority = priority;
		this.is_foridden = is_foridden;
	}

	@Override
	public String toString() {
		return "Tb_advertisingRelease [id=" + id + ", image=" + image + ", advertising_links=" + advertising_links
				+ ", advertising_money=" + advertising_money + ", priority=" + priority + ", is_foridden=" + is_foridden
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAdvertising_links() {
		return advertising_links;
	}

	public void setAdvertising_links(String advertising_links) {
		this.advertising_links = advertising_links;
	}

	public double getAdvertising_money() {
		return advertising_money;
	}

	public void setAdvertising_money(double advertising_money) {
		this.advertising_money = advertising_money;
	}

	public char getPriority() {
		return priority;
	}

	public void setPriority(char priority) {
		this.priority = priority;
	}

	public char getIs_foridden() {
		return is_foridden;
	}

	public void setIs_foridden(char is_foridden) {
		this.is_foridden = is_foridden;
	}

}
