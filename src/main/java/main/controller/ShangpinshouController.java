package main.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;

import main.domin.Commodity;
import main.dto.TiaojianDto;


/*
 * 刘欢欢
 * */
@RestController
@RequestMapping("shangpin")
@CrossOrigin
public class ShangpinshouController {
	@Autowired
	private main.service.CommodityTypeService CommodityTypeService;
	@Autowired
	private main.service.CommodityService CommodityService;
	@Autowired
	private main.service.CommodityDesignService CommodityDesignService;
	@RequestMapping("type")
	public List findType() {	
		return this.CommodityTypeService.findType();
	}
	@RequestMapping("findpage")
	public PageInfo<Commodity> findPage(TiaojianDto dto,String name,String id){
		 dto.setCommodityName(name);
		 dto.setTypeid(id);
		if(dto.getCommodityName()==null) {
			dto.setCommodityName("");
		};
		if(dto.getTypeid()==null) {
			dto.setTypeid("");
		};	
		PageInfo pageinfo=this.CommodityService.findPages(dto);
		System.out.println(dto.getCommodityName());
		return pageinfo;
	};
	/*商品详情查询方法*/
	@RequestMapping("findCommodity")
	public Commodity findCommodity(String id) {
		Commodity commodity=this.CommodityService.findCommodity(Integer.parseInt(id));
		return commodity;
	}
	@RequestMapping("findkuanshi")
	public List findkuanshi(String id) {
            List list=this.CommodityDesignService.findByid(id);
		return list;
		
	}

}
