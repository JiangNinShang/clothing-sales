package main.dao;

import java.util.List;
import java.util.Properties;

import javax.persistence.Column;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import main.domin.Commodity;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface CommodityMapper extends Mapper<Commodity> {
	@Select("select c.*from tb_commodity c inner join\r\n" + 
			"tb_commodity$type ct on c.id=ct.commodity_id inner join tb_commoditytype t on ct.type_id=t.id \r\n" + 
			"where c.commodity_name like #{name} and ct.type_id like #{id}")
	@Results(id="sss",value= {
			@Result(column="id",property="id"),
			@Result(column="commodity_image",property="commodityImage"),
			@Result(column="commodity_name",property="commodityName"),
			@Result(column="price",property="price"),
			@Result(column="discount",property="discount"),
			@Result(column="introduce",property="introduce"),
			@Result(column="is_shelves",property="isShelves"),
			@Result(column="release_time",property="releaseTime")
	})
	public List<Commodity> fenyechaxun(String name,String id);
}
