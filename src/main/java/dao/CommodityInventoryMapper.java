package dao;

import org.springframework.stereotype.Repository;

import domain.CommodityInventory;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface CommodityInventoryMapper extends Mapper<CommodityInventory> {

}
