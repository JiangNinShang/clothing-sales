package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dao.CommodityMapper;
import main.domin.Commodity;

@RequestMapping("Commodity")
@RestController
public class CommodityController {
	@Autowired
	CommodityMapper cm;
	
//	@RequestMapping("getCommodity")
//	public List<Commodity> getCommodity(){
//		return list;
//	}
}
