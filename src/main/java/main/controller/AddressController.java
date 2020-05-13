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
}
