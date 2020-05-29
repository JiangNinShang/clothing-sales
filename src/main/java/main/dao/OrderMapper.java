package main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import main.domin.Order;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface OrderMapper extends Mapper<Order> {

	@Results({
		@Result(column = "id", property = "id"),
		@Result(column = "member_id", property = "memberId"),
		@Result(column = "total", property = "total"),
		@Result(column = "address_id", property = "addressId"),
		@Result(column = "order_description", property = "orderDescription"),
		@Result(column = "order_state", property = "orderState"),
		@Result(column = "creation_time", property = "creationTime"),
		@Result(column = "settle_time", property = "settleTime"),
		@Result(column = "accomplish_time", property = "accomplishTime"),
		@Result(column = "id", property = "a",
		many = @Many(select = "main.dao.OrderInfoMapper.finds")),
	})
	@Select("SELECT * FROM tb_order WHERE member_id = #{id}")
		public List<Order> find(Integer id);
}
