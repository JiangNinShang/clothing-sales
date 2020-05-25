package main.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.OrderMapper;
import main.domin.Order;
import main.service.OrderService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
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
	public List<Order> QueryOrder(Integer memberId) {
		Example example = new Example(Order.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("memberId",memberId);
		List<Order> list = this.orderMapper.selectByExample(example);
		return list;
	}
}
