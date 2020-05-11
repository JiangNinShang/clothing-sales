package domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("广告")
@Table(name = "tb_advertisingRelease")
public class Advertising implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("图片")
	private String image;

	@ApiModelProperty("广告链接")
	@Column(name = "advertising_links")
	private String advertisingLinks;

	@ApiModelProperty("广告金额")
	@Column(name = "advertising_money")
	private Double advertisingMoney;

	@ApiModelProperty("优先级")
	private Character priority;

	@ApiModelProperty("到期时间")
	@Column(name = "expiration_time")
	private Date expirationTime;

	@ApiModelProperty("创建时间")
	@Column(name = "creation_time")
	private Date creationTime;

	public Advertising() {
		// TODO Auto-generated constructor stub
	}

	public Advertising(Integer id, String image, String advertisingLinks, Double advertisingMoney, Character priority,
			Date expirationTime, Date creationTime) {
		super();
		this.id = id;
		this.image = image;
		this.advertisingLinks = advertisingLinks;
		this.advertisingMoney = advertisingMoney;
		this.priority = priority;
		this.expirationTime = expirationTime;
		this.creationTime = creationTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAdvertisingLinks() {
		return advertisingLinks;
	}

	public void setAdvertisingLinks(String advertisingLinks) {
		this.advertisingLinks = advertisingLinks;
	}

	public Double getAdvertisingMoney() {
		return advertisingMoney;
	}

	public void setAdvertisingMoney(Double advertisingMoney) {
		this.advertisingMoney = advertisingMoney;
	}

	public Character getPriority() {
		return priority;
	}

	public void setPriority(Character priority) {
		this.priority = priority;
	}

	public Date getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	@Override
	public String toString() {
		return "Advertising [id=" + id + ", image=" + image + ", advertisingLinks=" + advertisingLinks
				+ ", advertisingMoney=" + advertisingMoney + ", priority=" + priority + ", expirationTime="
				+ expirationTime + ", creationTime=" + creationTime + "]";
	}

}
