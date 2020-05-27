package main.dto;

public class CommodityTypeDto {

	private Integer commodityId;

	private Integer typeId;

	public Integer getCommodityId() {
		return commodityId;
	}

	public CommodityTypeDto setCommodityId(Integer commodityId) {
		this.commodityId = commodityId;
		return this;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public CommodityTypeDto setTypeId(Integer typeId) {
		this.typeId = typeId;
		return this;
	}

}
