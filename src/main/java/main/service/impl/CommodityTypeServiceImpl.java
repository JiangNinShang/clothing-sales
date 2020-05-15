package main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.CommodityTypeMapper;
import main.domin.CommodityType;
import main.service.CommodityTypeService;
import tk.mybatis.mapper.entity.Example;

@Service("CommodityTypeService")
public class CommodityTypeServiceImpl implements CommodityTypeService{
	@Autowired
	private CommodityTypeMapper ctMapper;
	@Override
	public List<CommodityType> getAllType() {
		Example example=new Example(CommodityType.class);
		example.setOrderByClause("id asc");
		return this.ctMapper.selectByExample(example);
	}

}
