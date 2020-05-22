package main.service;

import java.util.List;

import com.github.pagehelper.PageInfo;

import main.domin.Commodity;
import main.dto.TiaojianDto;

public interface CommodityService {
	List<Commodity> getCommodity();

	/*
	 * 刘欢欢 分页
	 */
	public PageInfo findPages(TiaojianDto dto);

	/*
	 *  查询单个商品
	 */
	public Commodity findCommodity(int id);
}
