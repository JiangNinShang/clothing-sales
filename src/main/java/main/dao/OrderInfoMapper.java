package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.OrderInfo;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface OrderInfoMapper extends Mapper<OrderInfo> {

}
