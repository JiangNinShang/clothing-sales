package main.controller;
/**
 * 
 * @author 蒋宁善
 *
 */

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import main.domin.Address;
import main.service.AddressService;

@RestController
@RequestMapping("Address")
public class AddressController {
	@Autowired
	AddressService as;

	@ApiOperation("返回地址集合")
	@PostMapping("/getAddress")
	@ResponseBody
	@RequestMapping("getAddress")
	public List<Address> getAddress() {
		return as.getAddress();
	}

	@ApiOperation("删除")
	@PostMapping("/deAddress")
	@ResponseBody
	@RequestMapping("deAddress")
	public int deAddress(@ApiParam("删除的用户编号") int id) {
		System.out.println(id);
		return as.deAddress(id);
	}
}
