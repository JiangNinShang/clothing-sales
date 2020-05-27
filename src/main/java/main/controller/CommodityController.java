package main.controller;
/**
 * 
 * @author 蒋宁善
 *
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import main.dao.CommodityMapper;
import main.domin.Commodity;
import main.service.CommodityService;

@RequestMapping("Commodity")
@RestController
public class CommodityController {
	@Autowired
	CommodityService cs;

	@ApiOperation("获取所有商品")
	@PostMapping("/deAddress")
	@RequestMapping("getCommodity")
	public List<Commodity> getCommodity() {
		return cs.all();
	}
}
