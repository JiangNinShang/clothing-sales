package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.Advertising;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface AdvertisingMapper extends Mapper<Advertising> {

}
