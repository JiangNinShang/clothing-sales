package main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.AddressMapper;
import main.domin.Address;
import main.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService{
	@Autowired
	AddressMapper am;
	/**
	  *  功能描述: 获取地址的方法
	 * @author 蒋宁善 	
	 * @Param: 无
	 * @Return: List<Address> 地址集合
	 * @Date: 5月13日09:32
	 */
	@Override
	public List<Address> getAddress() {
		return am.selectAll();
	}

}
