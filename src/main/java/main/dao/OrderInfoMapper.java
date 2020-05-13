package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.OrderInfo;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface OrderInfoMapper extends Mapper<OrderInfo> {

}
