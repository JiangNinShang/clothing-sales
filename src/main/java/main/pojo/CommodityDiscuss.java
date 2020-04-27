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
 * @author 蒋宁善 表
 */
@SuppressWarnings("all")
@ApiModel("表")
@Table(name = "tb_commodityDiscuss")
public class CommodityDiscuss implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 商品编号 */
	@ApiModelProperty("商品编号")
	private int commodity;
	/** 会员编号 */
	@ApiModelProperty("会员编号")
	private int member_id;
	/** 评论级别 */
	@ApiModelProperty("评论级别")
	private byte rank;
	/** 内容 */
	@ApiModelProperty("内容")
	private String content;
	/** 赞 */
	@ApiModelProperty("赞")
	private int praise;
	/** 踩 */
	@ApiModelProperty("踩")
	private int trample;
	/** 上级编号 */
	@ApiModelProperty("上级编号")
	private int superior_id;
	/** 评论时间 */
	@ApiModelProperty("评论时间")
	private Date discuss_time;

	public CommodityDiscuss() {
		// TODO Auto-generated constructor stub
	}

	public CommodityDiscuss(int id, int commodity, int member_id, byte rank, String content, int praise, int trample,
			int superior_id, Date discuss_time) {
		super();
		this.id = id;
		this.commodity = commodity;
		this.member_id = member_id;
		this.rank = rank;
		this.content = content;
		this.praise = praise;
		this.trample = trample;
		this.superior_id = superior_id;
		this.discuss_time = discuss_time;
	}

	@Override
	public String toString() {
		return "Tb_commodityDiscuss [id=" + id + ", commodity=" + commodity + ", member_id=" + member_id + ", rank="
				+ rank + ", content=" + content + ", praise=" + praise + ", trample=" + trample + ", superior_id="
				+ superior_id + ", discuss_time=" + discuss_time + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCommodity() {
		return commodity;
	}

	public void setCommodity(int commodity) {
		this.commodity = commodity;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public byte getRank() {
		return rank;
	}

	public void setRank(byte rank) {
		this.rank = rank;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPraise() {
		return praise;
	}

	public void setPraise(int praise) {
		this.praise = praise;
	}

	public int getTrample() {
		return trample;
	}

	public void setTrample(int trample) {
		this.trample = trample;
	}

	public int getSuperior_id() {
		return superior_id;
	}

	public void setSuperior_id(int superior_id) {
		this.superior_id = superior_id;
	}

	public Date getDiscuss_time() {
		return discuss_time;
	}

	public void setDiscuss_time(Date discuss_time) {
		this.discuss_time = discuss_time;
	}

}
