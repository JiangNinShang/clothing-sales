package main.service;

import java.util.List;

import main.domin.CommodityRelease;

public interface CommodityReleaseService {
	/**
	 * 根据code查询
	 * @author 梁淼
	 * @param code
	 * @Data:2020-05-12
	 */
	public List<CommodityRelease> findByCode(String code);
}
