package main.dao;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import main.domin.OrderInfo;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface OrderInfoMapper extends Mapper<OrderInfo> {
	@Results({
		@Result(column = "id", property = "id"),
		@Result(column = "order_id", property = "orderId"),
		@Result(column = "commodity_id", property = "commodityId"),
		@Result(column = "disign_id", property = "disignId"),
		@Result(column = "size", property = "size"),
		@Result(column = "count", property = "count"),
		@Result(column = "commodity_id", property = "com",
		one = @One(select = "main.dao.CommodityMapper.caol")),
		@Result(column = "disign_id", property = "comdi",
		one = @One(select = "main.dao.CommodityDesignMapper.gainDesignByCommodityId")),
	})
	@Select("SELECT * FROM tb_orderInfo WHERE order_id = #{id}")
		public List<OrderInfo> finds(Integer id);
}
