package main.service;

import java.util.List;


import main.domin.Commodity;
import main.dto.TiaojianDto;

public interface CommodityService {

	public List<Commodity> all();
	
	public List<Commodity> giao(Integer i);
}
