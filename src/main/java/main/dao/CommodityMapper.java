package main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import main.domin.Commodity;
import tk.mybatis.mapper.common.Mapper;

@Repository
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
			many = @Many(select = "com.newer.dao.CommodityTypeMapper.gainTypeByCommodityId")),
		@Result(column = "id", property = "commodityDesigns",
			many = @Many(select = "com.newer.dao.CommodityDesignMapper.gainDesignByCommodityId"))
	})
	@Select("SELECT * FROM tb_commodity")
	public List<Commodity> gainCommodityAll();

}
