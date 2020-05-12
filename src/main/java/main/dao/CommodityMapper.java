package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.Commodity;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface CommodityMapper extends Mapper<Commodity> {

}
