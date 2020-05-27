package main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import main.domin.CommodityInventory;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface CommodityInventoryMapper extends Mapper<CommodityInventory> {

	@Results({
		@Result(column = "id", property = "id"),
		@Result(column = "design", property = "design"),
		@Result(column = "size", property = "size"),
		@Result(column = "inventory", property = "inventory"),
		@Result(column = "predefine_inventory", property = "predefineInventory")
	})
	@Select("SELECT * FROM tb_commodityInventory WHERE design = #{designId}")
	public List<CommodityInventory> gainInventoryByDesignId(Integer designId);

}
