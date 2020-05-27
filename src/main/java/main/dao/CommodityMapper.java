package main.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;

import main.domin.Commodity;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface CommodityMapper extends Mapper<Commodity> {

	// 获取所有商品
	@Results({
		@Result(column = "id", property = "id"),
		@Result(column = "commodity_image", property = "commodityImage"),
		@Result(column = "commodity_name", property = "commodityName"),
		@Result(column = "price", property = "price"), @Result(column = "discount", property = "discount"),
		@Result(column = "introduce", property = "introduce"),
		@Result(column = "is_shelves", property = "isShelves"),
		@Result(column = "release_time", property = "releaseTime"),
		@Result(column = "id", property = "commodityTypeIds",
			many = @Many(select = "main.dao.CommodityTypeMapper.gainTypeByCommodityId")),
		@Result(column = "id", property = "commodityDesigns",
			many = @Many(select = "main.dao.CommodityDesignMapper.gainDesignByCommodityId"))
	})
	@Select("SELECT * FROM tb_commodity")
	public List<Commodity> gainCommodityAll();

}
