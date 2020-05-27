package main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import main.domin.CommodityDesign;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface CommodityDesignMapper extends Mapper<CommodityDesign> {

	@Results({
		@Result(column = "id", property = "id"),
		@Result(column = "commodity_id", property = "commodityId"),
		@Result(column = "design_image", property = "designImage"),
		@Result(column = "design", property = "design"),
		@Result(column = "id", property = "inventorys",
			many = @Many(select = "com.newer.dao.CommodityInventoryMapper.gainInventoryByDesignId"))
	})
	@Select("SELECT * FROM tb_commodityDesign WHERE commodity_id = #{commodityId}")
	public List<CommodityDesign> gainDesignByCommodityId(Integer commodityId);

}
