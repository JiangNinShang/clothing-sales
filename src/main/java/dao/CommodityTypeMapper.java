package dao;

import org.springframework.stereotype.Repository;

import domain.CommodityType;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface CommodityTypeMapper extends Mapper<CommodityType> {

}
