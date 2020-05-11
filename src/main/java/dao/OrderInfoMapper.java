package dao;

import org.springframework.stereotype.Repository;

import domain.OrderInfo;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OrderInfoMapper extends Mapper<OrderInfo> {

}
