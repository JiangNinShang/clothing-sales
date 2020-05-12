package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.CommodityType;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface CommodityTypeMapper extends Mapper<CommodityType> {

}
