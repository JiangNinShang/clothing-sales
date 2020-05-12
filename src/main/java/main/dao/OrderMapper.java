package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.Order;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OrderMapper extends Mapper<Order> {

}
