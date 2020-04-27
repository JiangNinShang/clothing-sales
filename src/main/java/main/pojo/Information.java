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
 * @author 蒋宁善  消息发布表
 */
@SuppressWarnings("all")
@ApiModel("消息发布表")
@Table(name = "tb_information")
public class Information implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 标题 */
	@ApiModelProperty("标题")
	private String title;
	/** 内容 */
	@ApiModelProperty("内容")
	private String content;
	/** 发布人/管理员编号 */
	@ApiModelProperty("发布人/管理员编号")
	private int admin_id;
	/** 发布状态 */
	@ApiModelProperty("发布状态")
	private char release_state;
	/** 发布时间 */
	@ApiModelProperty("发布时间")
	private Date release_time;

	public Information() {
		// TODO Auto-generated constructor stub
	}

	public Information(int id, String title, String content, int admin_id, char release_state, Date release_time) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.admin_id = admin_id;
		this.release_state = release_state;
		this.release_time = release_time;
	}

	@Override
	public String toString() {
		return "Tb_information [id=" + id + ", title=" + title + ", content=" + content + ", admin_id=" + admin_id
				+ ", release_state=" + release_state + ", release_time=" + release_time + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public char getRelease_state() {
		return release_state;
	}

	public void setRelease_state(char release_state) {
		this.release_state = release_state;
	}

	public Date getRelease_time() {
		return release_time;
	}

	public void setRelease_time(Date release_time) {
		this.release_time = release_time;
	}

}
