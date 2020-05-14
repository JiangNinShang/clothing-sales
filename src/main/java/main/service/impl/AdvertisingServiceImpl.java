package main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.AdvertisingMapper;
import main.domin.Advertising;
import main.service.AdvertisingService;

@Service
public class AdvertisingServiceImpl implements AdvertisingService{
	@Autowired
	private AdvertisingMapper advertisingMapper;

	@Override
	public List<Advertising> findAdvAll() {
				return this.advertisingMapper.selectAll();
	}
	
	
	
}
