package main.service;

import java.util.List;

import main.domin.Address;

/**
 * 
 * @author 蒋宁善
 *
 */
public interface AddressService {
	/**
	 * 功能描述: 获取地址的方法
	 * 
	 * @author 蒋宁善
	 * @Param: 无
	 * @Return: List<Address> 地址集合
	 * @Date: 5月13日09:32
	 */
	List<Address> getAddress();

	/**
	 * 功能描述: 删除地址的方法
	 * 
	 * @author 蒋宁善
	 * @Param: i 地址编号
	 * @Return: int 删除后返回的数字
	 * @Date: 5月13日15:16
	 * 
	 */
	int deAddress(int i);
}
