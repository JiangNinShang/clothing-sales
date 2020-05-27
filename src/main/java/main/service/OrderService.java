package main.service;

import java.util.List;

import main.domin.Order;


public interface OrderService {

	/*
	 * 功能描述：查询所有订单的方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Order
	 * 
	 * @Date:4月28日 20:30
	 */
	public List<Order> QueryOrder(Integer memberId);
}
