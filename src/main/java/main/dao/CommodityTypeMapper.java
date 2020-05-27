package main.dao;

import org.apache.ibatis.annotations.*;

import main.domin.CommodityType;
import main.dto.CommodityTypeDto;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface CommodityTypeMapper extends Mapper<CommodityType> {

	@Select("SELECT type_id FROM tb_commodity$type WHERE commodity_id = #{commodityId}")
	public Integer[] gainTypeByCommodityId(Integer commodityId);

	// 添加商品类型关联
	@Insert("INSERT INTO tb_commodity$type(commodity_id,type_id) VALUES(#{commodityId},#{typeId})")
	public Integer insertCommodity$Type(CommodityTypeDto dto);
	
	@Select("SELECT id FROM tb_commodityType WHERE superior_id = #{typeId}")
	public Integer[] gainTypeIds(Integer typeId);
	
	@Delete("DELETE FROM tb_commodity$type WHERE type_id = #{typeId}")
	public Integer deleteCommodity$Type(Integer typeId);
	
	@Delete("DELETE FROM tb_commodity$type WHERE commodity_id = #{commodityId}")
	public Integer deleteCommodity$TypeZ(Integer commodityId);

}
