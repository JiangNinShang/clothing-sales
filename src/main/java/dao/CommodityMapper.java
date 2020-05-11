package dao;

import org.springframework.stereotype.Repository;

import domain.Commodity;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface CommodityMapper extends Mapper<Commodity> {

}
