package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.Order;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface OrderMapper extends Mapper<Order> {

}
