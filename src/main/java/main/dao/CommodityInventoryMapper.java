package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.CommodityInventory;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface CommodityInventoryMapper extends Mapper<CommodityInventory> {

}
