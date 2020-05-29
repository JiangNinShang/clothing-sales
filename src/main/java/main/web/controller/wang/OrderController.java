package main.web.controller.wang;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.domin.Order;
import main.service.OrderService;

@RestController
@RequestMapping("Order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	/*
	 * 功能描述：查询订单方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Order
	 * 
	 * @Date:4月29日 15:44
	 */
	@RequestMapping("query")
	public List<Order> queryById(Integer memberId) {
		List<Order> order = this.orderService.QueryOrder(memberId);
		return order;
	}
	
	/*
	 * 功能描述：链接查询订单方法
	 * 
	 * @author 王李辉
	 * 
	 * @Param：Order
	 * 
	 * @Date:4月29日 15:44
	 */
	@RequestMapping("querys")
	public List<Order> ljxcOrderById(Integer id) {
		List<Order> order = this.orderService.ljcxOrderById(id);
		return order;
	}
}
