package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.CommodityDesign;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface CommodityDesignMapper extends Mapper<CommodityDesign> {
	
}
