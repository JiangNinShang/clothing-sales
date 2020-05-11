package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品类型")
@Table(name = "tb_commodityType")
public class CommodityType implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@ApiModelProperty("编号")
	private Integer id;

	@ApiModelProperty("类型名称")
	@Column(name = "type_name")
	private String typeName;

	@ApiModelProperty("上级编号")
	@Column(name = "superior_id")
	private Integer superiorId;

	public CommodityType() {
		// TODO Auto-generated constructor stub
	}

	public CommodityType(Integer id, String typeName, Integer superiorId) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.superiorId = superiorId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getSuperiorId() {
		return superiorId;
	}

	public void setSuperiorId(Integer superiorId) {
		this.superiorId = superiorId;
	}

	@Override
	public String toString() {
		return "CommodityType [id=" + id + ", typeName=" + typeName + ", superiorId=" + superiorId + "]";
	}

}
