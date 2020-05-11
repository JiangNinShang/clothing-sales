package domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("角色")
@Table(name = "tb_role")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("角色名")
	@Column(name = "role_name")
	private String roleName;

	@ApiModelProperty("介绍")
	private String introduce;

	@ApiModelProperty("创建时间")
	@Column(name = "creation_time")
	private Date creationTime;

	private Integer[] resourceIds;

	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Role(Integer id, String roleName, String introduce, Date creationTime, Integer[] resourceIds) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.introduce = introduce;
		this.creationTime = creationTime;
		this.resourceIds = resourceIds;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Integer[] getResourceIds() {
		return resourceIds;
	}

	public void setResourceIds(Integer[] resourceIds) {
		this.resourceIds = resourceIds;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", introduce=" + introduce + ", creationTime="
				+ creationTime + ", resourceIds=" + Arrays.toString(resourceIds) + "]";
	}

}
