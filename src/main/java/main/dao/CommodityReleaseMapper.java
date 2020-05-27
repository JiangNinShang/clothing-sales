package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.CommodityRelease;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface CommodityReleaseMapper extends Mapper<CommodityRelease> {

}
