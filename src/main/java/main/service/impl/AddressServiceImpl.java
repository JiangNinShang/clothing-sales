package main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.AddressMapper;
import main.domin.Address;
import main.service.AddressService;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	AddressMapper am;

	@Override
	public List<Address> getAddress() {
		Address a = new Address();
		a.setState('1');
		return am.select(a);
	}

	@Override
	public int deAddress(int i) {
		Example example = new Example(Address.class);
		// where 条件
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("id", i);
		Address a = new Address();
		a.setState('0'); 
		return am.updateByExampleSelective(a, example);
	}
}
