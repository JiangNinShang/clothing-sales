package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.CommodityRelease;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface CommodityReleaseMapper extends Mapper<CommodityRelease> {

}
