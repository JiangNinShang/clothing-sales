package dao;

import org.springframework.stereotype.Repository;

import domain.Order;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OrderMapper extends Mapper<Order> {

}
