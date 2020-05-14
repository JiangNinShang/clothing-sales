package main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.CommodityMapper;
import main.dao.CommodityReleaseMapper;
import main.domin.Commodity;
import main.domin.CommodityRelease;
import main.service.CommodityReleaseService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class CommodityReleaseServiceImpl implements CommodityReleaseService{
	@Autowired
	private CommodityReleaseMapper commodityReleaseMapper;
	@Autowired
	private CommodityMapper commodityMapper;
	
	@Override
	public List<CommodityRelease> findByCode(String code) {
		Example example=new Example(CommodityRelease.class);
		Criteria criteria=example.createCriteria();
		criteria.andEqualTo("code", code);
		List<CommodityRelease> list=this.commodityReleaseMapper.selectByExample(example);
		for (CommodityRelease commodityRelease : list) {
			commodityRelease.setCommodity(this.commodityMapper.selectByPrimaryKey(commodityRelease.getCommodityId()));
		}
		return list;
	}
}
