package main.service;
/*
 * lhh
 * */

import java.util.List;

import main.domin.CommodityDesign;



public interface CommodityDesignService {
   public List<CommodityDesign> findByid(String shangpinid);
}
