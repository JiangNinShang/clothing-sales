package main.domin;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("反馈")
@Table(name = "tb_feedback")
public class Feedback implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("会员编号")
	@Column(name = "member_id")
	private Integer memberId;

	@ApiModelProperty("会员名")
	@Column(name = "member_name")
	private String memberName;

	@ApiModelProperty("反馈类型")
	@Column(name = "feedback_type")
	private String feedbackType;

	@ApiModelProperty("反馈主题")
	@Column(name = "feedback_theme")
	private String feedbackTheme;

	@ApiModelProperty("反馈内容")
	@Column(name = "feedback_introduce")
	private String feedbackIntroduce;

	@ApiModelProperty("发布时间")
	@Column(name = "release_time")
	private Date releaseTime;

	public Feedback() {
		// TODO Auto-generated constructor stub
	}

	public Feedback(Integer id, Integer memberId, String memberName, String feedbackType, String feedbackTheme,
			String feedbackIntroduce, Date releaseTime) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.memberName = memberName;
		this.feedbackType = feedbackType;
		this.feedbackTheme = feedbackTheme;
		this.feedbackIntroduce = feedbackIntroduce;
		this.releaseTime = releaseTime;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getFeedbackType() {
		return feedbackType;
	}

	public void setFeedbackType(String feedbackType) {
		this.feedbackType = feedbackType;
	}

	public String getFeedbackTheme() {
		return feedbackTheme;
	}

	public void setFeedbackTheme(String feedbackTheme) {
		this.feedbackTheme = feedbackTheme;
	}

	public String getFeedbackIntroduce() {
		return feedbackIntroduce;
	}

	public void setFeedbackIntroduce(String feedbackIntroduce) {
		this.feedbackIntroduce = feedbackIntroduce;
	}

	public Date getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", memberId=" + memberId + ", memberName=" + memberName + ", feedbackType="
				+ feedbackType + ", feedbackTheme=" + feedbackTheme + ", feedbackIntroduce=" + feedbackIntroduce
				+ ", releaseTime=" + releaseTime + "]";
	}

}
