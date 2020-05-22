package main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.domin.CommodityDesign;
import main.service.CommodityDesignService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class CommodityDesignServiceImpl implements CommodityDesignService{

	@Autowired
	private main.dao.CommodityDesignMapper CommodityDesignMapper;

	@Override
	public List<CommodityDesign> findByid(String shangpinid) {
		// TODO Auto-generated method stub
		Example example=new Example(CommodityDesign.class);
		Criteria cr=example.createCriteria();
		cr.andEqualTo("commodityId", shangpinid);
		return this.CommodityDesignMapper.selectByExample(example);
	}
	
}
