package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.CommodityDiscuss;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface CommodityDiscussMapper extends Mapper<CommodityDiscuss> {

}
