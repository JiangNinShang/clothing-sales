package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("资源 ")
@Table(name = "tb_resource")
public class Resource implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("代码")
	private String code;

	@ApiModelProperty("资源名")
	@Column(name = "resource_name")
	private String resourceName;

	@ApiModelProperty("上级编号")
	@Column(name = "superior_id")
	private Integer superiorId;

	public Resource() {
		// TODO Auto-generated constructor stub
	}

	public Resource(Integer id, String code, String resourceName, Integer superiorId) {
		super();
		this.id = id;
		this.code = code;
		this.resourceName = resourceName;
		this.superiorId = superiorId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public Integer getSuperiorId() {
		return superiorId;
	}

	public void setSuperiorId(Integer superiorId) {
		this.superiorId = superiorId;
	}

	@Override
	public String toString() {
		return "Resource [id=" + id + ", code=" + code + ", resourceName=" + resourceName + ", superiorId=" + superiorId
				+ "]";
	}

}
