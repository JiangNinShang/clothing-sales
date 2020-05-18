package main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.CommodityMapper;
import main.domin.Address;
import main.domin.Commodity;
import main.service.CommodityService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class CommodityServiceImpl implements CommodityService{
	@Autowired
	CommodityMapper cm;
	@Override
	public List<Commodity> getCommodity() {
		Commodity a = new Commodity();
		a.setIsShelves('1');
		return cm.select(a);
	}
}
