package main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import main.dao.CommodityMapper;
import main.domin.Address;
import main.domin.Commodity;
import main.dto.TiaojianDto;
import main.service.CommodityService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	CommodityMapper cm;

	@Override
	public List<Commodity> getCommodity() {
		Commodity a = new Commodity();
		a.setIsShelves('0');
		return cm.select(a);
	}

	@Override
	public List<Commodity> findPages(TiaojianDto dto) {
		List<Commodity> list = this.cm.fenyechaxun("%" + dto.getCommodityName() + "%", "%" + dto.getTypeid() + "%");
		return list;
	}

	@Override
	public Commodity findCommodity(int id) {
		return this.cm.selectByPrimaryKey(id);
	}
}
