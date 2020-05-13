package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.CommodityType;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface CommodityTypeMapper extends Mapper<CommodityType> {

}
