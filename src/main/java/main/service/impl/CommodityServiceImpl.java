package main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.CommodityMapper;
import main.domin.Commodity;
import main.service.CommodityService;
import tk.mybatis.mapper.entity.Example;
@Service
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	CommodityMapper cm;

	@Override
	public List<Commodity> all() {
		return cm.gainCommodityAll();
	}

	@Override
	public List<Commodity> giao(Integer i) {
		return cm.caol(i);
	}
}
