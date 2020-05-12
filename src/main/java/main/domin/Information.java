package main.domin;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("消息发布")
@Table(name = "tb_information")
public class Information implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("标题")
	private String title;

	@ApiModelProperty("内容")
	private String content;

	@ApiModelProperty("发布人/管理员编号")
	@Column(name = "admin_id")
	private Integer adminId;

	@ApiModelProperty("发布状态")
	@Column(name = "release_state")
	private Character releaseState;

	@ApiModelProperty("发布时间")
	@Column(name = "release_time")
	private Date releaseTime;

	public Information() {
		// TODO Auto-generated constructor stub
	}

	public Information(Integer id, String title, String content, Integer adminId, Character releaseState, Date releaseTime) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.adminId = adminId;
		this.releaseState = releaseState;
		this.releaseTime = releaseTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public Character getReleaseState() {
		return releaseState;
	}

	public void setReleaseState(Character releaseState) {
		this.releaseState = releaseState;
	}

	public Date getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}

	@Override
	public String toString() {
		return "Information [id=" + id + ", title=" + title + ", content=" + content + ", adminId=" + adminId
				+ ", releaseState=" + releaseState + ", releaseTime=" + releaseTime + "]";
	}

}
