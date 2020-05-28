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
	public List<Address> getAddress(int id) {
		return as.getAddress(id);
	}

	@ApiOperation("删除")
	@PostMapping("/deAddress")
	@ResponseBody
	@RequestMapping("deAddress")
	public int deAddress(@ApiParam("删除的用户编号") int id) {
		return as.deAddress(id);
	}

	@ApiOperation("添加地址")
	@PostMapping("/adAddress")
	@ResponseBody
	@RequestMapping("adAddress")
	public void adAddress(@ApiParam("地址信息") @Param("id") Integer id, @Param("memberId") Integer memberId,
			@Param("name") String name, @Param("sity") String sity, @Param("memberId") String phone) {
		String[] strArr = sity.split(",");
		Address a = new Address();
		a.setState('0');
		a.setMemberId(memberId);
		a.setConsigneeName(name);
		a.setProvince(strArr[0]);
		a.setCity(strArr[1]);
		a.setDistrict(strArr[2]);
		a.setAddress(strArr[3]);
		a.setMobile(phone);
		as.adAddress(a);
	}
}
