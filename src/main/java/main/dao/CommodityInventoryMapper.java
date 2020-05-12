package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.CommodityInventory;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface CommodityInventoryMapper extends Mapper<CommodityInventory> {

}
