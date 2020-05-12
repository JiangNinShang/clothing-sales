package main.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.dao.OrderMapper;
import main.domin.Order;
import main.service.OrderService;


public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderMapper orderMapper;

	/*
	 * 功能描述：查询所有订单的方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Order
	 * 
	 * @Date:4月28日 20:30
	 */
	@Override
	public List<Order> QueryOrder() {
		List<Order> list = this.orderMapper.selectAll();
		return list;
	}

	
	

}
