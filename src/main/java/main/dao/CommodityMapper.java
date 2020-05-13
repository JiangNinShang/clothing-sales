package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.Commodity;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface CommodityMapper extends Mapper<Commodity> {

}
