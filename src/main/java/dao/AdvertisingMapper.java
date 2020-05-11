package dao;

import org.springframework.stereotype.Repository;

import domain.Advertising;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface AdvertisingMapper extends Mapper<Advertising> {

}
