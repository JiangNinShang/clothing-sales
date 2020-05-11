package domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品评论")
@Table(name = "tb_commodityDiscuss")
public class CommodityDiscuss implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("商品编号")
	private Integer commodity;

	@ApiModelProperty("会员编号")
	@Column(name = "member_id")
	private Integer memberId;

	@ApiModelProperty("评论级别")
	private Byte rank;

	@ApiModelProperty("内容")
	private String content;

	@ApiModelProperty("赞")
	private Integer praise;

	@ApiModelProperty("踩")
	private Integer trample;

	@ApiModelProperty("上级编号")
	@Column(name = "superior_id")
	private Integer superiorId;

	@ApiModelProperty("评论时间")
	@Column(name = "discuss_time")
	private Date discussTime;

	public CommodityDiscuss() {
		// TODO Auto-generated constructor stub
	}

	public CommodityDiscuss(Integer id, Integer commodity, Integer memberId, Byte rank, String content, Integer praise, Integer trample,
			Integer superiorId, Date discussTime) {
		super();
		this.id = id;
		this.commodity = commodity;
		this.memberId = memberId;
		this.rank = rank;
		this.content = content;
		this.praise = praise;
		this.trample = trample;
		this.superiorId = superiorId;
		this.discussTime = discussTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCommodity() {
		return commodity;
	}

	public void setCommodity(Integer commodity) {
		this.commodity = commodity;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Byte getRank() {
		return rank;
	}

	public void setRank(Byte rank) {
		this.rank = rank;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getPraise() {
		return praise;
	}

	public void setPraise(Integer praise) {
		this.praise = praise;
	}

	public Integer getTrample() {
		return trample;
	}

	public void setTrample(Integer trample) {
		this.trample = trample;
	}

	public Integer getSuperiorId() {
		return superiorId;
	}

	public void setSuperiorId(Integer superiorId) {
		this.superiorId = superiorId;
	}

	public Date getDiscussTime() {
		return discussTime;
	}

	public void setDiscussTime(Date discussTime) {
		this.discussTime = discussTime;
	}

	@Override
	public String toString() {
		return "CommodityDiscuss [id=" + id + ", commodity=" + commodity + ", memberId=" + memberId + ", rank=" + rank
				+ ", content=" + content + ", praise=" + praise + ", trample=" + trample + ", superiorId=" + superiorId
				+ ", discussTime=" + discussTime + "]";
	}

}
