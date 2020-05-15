package main.web.controller.home;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.domin.Advertising;
import main.domin.CommodityRelease;
import main.service.AdvertisingService;
import main.service.CommodityReleaseService;

@CrossOrigin
@RestController
@RequestMapping("/release")
public class ReleaseController {
	@Autowired private CommodityReleaseService crService;
	@Autowired private AdvertisingService advService;
	
	@RequestMapping("/findCrByCode")
	public List<CommodityRelease> findCrByCode(String code){
		return this.crService.findByCode(code);
	}
	
	@RequestMapping("/findAdvAll")
	public List<Advertising> findAdvAll(){
		return this.advService.findAdvAll();
	}
}
