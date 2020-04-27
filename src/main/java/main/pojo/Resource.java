package main.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 蒋宁善 资源表 
 */
@SuppressWarnings("all")
@ApiModel("资源表 ")
@Table(name = "tb_resource")
public class Resource implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/** 编号 */
	@ApiModelProperty("编号")
	private int id;
	/** 资源名 */
	@ApiModelProperty("资源名")
	private String resource_name;
	/** 介绍 */
	@ApiModelProperty("介绍")
	private String introduce;
	/** 上级编号 */
	@ApiModelProperty("上级编号")
	private int superior_id;

	public Resource() {
		// TODO Auto-generated constructor stub
	}

	public Resource(int id, String resource_name, String introduce, int superior_id) {
		super();
		this.id = id;
		this.resource_name = resource_name;
		this.introduce = introduce;
		this.superior_id = superior_id;
	}

	@Override
	public String toString() {
		return "Tb_resource [id=" + id + ", resource_name=" + resource_name + ", introduce=" + introduce
				+ ", superior_id=" + superior_id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResource_name() {
		return resource_name;
	}

	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public int getSuperior_id() {
		return superior_id;
	}

	public void setSuperior_id(int superior_id) {
		this.superior_id = superior_id;
	}

}
