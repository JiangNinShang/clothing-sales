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
@Table(name = "tb_feedback")
public class Feedback implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 会员编号 */
	@ApiModelProperty("会员编号")
	private int member_id;
	/** 会员名 */
	@ApiModelProperty("会员名")
	private String member_name;
	/** 反馈类型 */
	@ApiModelProperty("反馈类型")
	private String feedback_type;
	/** 反馈主题 */
	@ApiModelProperty("反馈主题")
	private String feedback_theme;
	/** 反馈内容	 */
	@ApiModelProperty("反馈内容")
	private String feedback_introduce;
	/** 发布时间 */
	@ApiModelProperty("发布时间")
	private Date release_time;

	public Feedback() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getFeedback_type() {
		return feedback_type;
	}

	public void setFeedback_type(String feedback_type) {
		this.feedback_type = feedback_type;
	}

	public String getFeedback_theme() {
		return feedback_theme;
	}

	public void setFeedback_theme(String feedback_theme) {
		this.feedback_theme = feedback_theme;
	}

	public String getFeedback_introduce() {
		return feedback_introduce;
	}

	public void setFeedback_introduce(String feedback_introduce) {
		this.feedback_introduce = feedback_introduce;
	}

	public Date getRelease_time() {
		return release_time;
	}

	public void setRelease_time(Date release_time) {
		this.release_time = release_time;
	}

	public Feedback(int id, int member_id, String member_name, String feedback_type, String feedback_theme,
			String feedback_introduce, Date release_time) {
		super();
		this.id = id;
		this.member_id = member_id;
		this.member_name = member_name;
		this.feedback_type = feedback_type;
		this.feedback_theme = feedback_theme;
		this.feedback_introduce = feedback_introduce;
		this.release_time = release_time;
	}

	@Override
	public String toString() {
		return "Tb_feedback [id=" + id + ", member_id=" + member_id + ", member_name=" + member_name
				+ ", feedback_type=" + feedback_type + ", feedback_theme=" + feedback_theme + ", feedback_introduce="
				+ feedback_introduce + ", release_time=" + release_time + "]";
	}

}
