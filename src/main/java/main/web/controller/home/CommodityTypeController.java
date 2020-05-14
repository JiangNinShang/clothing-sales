package main.web.controller.home;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.domin.CommodityType;
import main.service.CommodityTypeService;

@CrossOrigin
@RestController
@RequestMapping("/type")
public class CommodityTypeController {
	@Autowired
	private CommodityTypeService ctService;
	
	/**
	   * 获取所有类型数据
	   * @return
	   */
	  @RequestMapping("/findType")
	  public Map<String,Object> findType() {
		  Map<String,Object> data = new HashMap<String,Object>();
		   //查询所有菜单
		      List<CommodityType> allType = this.ctService.getAllType();
		      //根节点
		      List<CommodityType> rootType = new ArrayList<CommodityType>();
		      for (CommodityType nav : allType) {
		        if(nav.getSuperiorId()==0){//父节点是0的，为根节点。
		        	rootType.add(nav);
		        }
		      }
		     
		      //为根菜单设置子菜单，getClild是递归调用的
		      for (CommodityType nav : rootType) {
		        /* 获取根节点下的所有子节点 使用getChild方法*/
		        List<CommodityType> childList = getChild(nav.getId(), allType);
		        nav.setChildType(childList);//给根节点设置子节点
		      }
		      //存储所有类型
		      data.put("success", "true");
		      data.put("list", rootType);
		      return data;
		    
		      
	  }
	  
	  
	  /**
	   * 获取子节点
	   * @param id 父节点id
	   * @param allType 所有菜单列表
	   * @return 每个根节点下，所有子菜单列表
	   */
	  public List<CommodityType> getChild(Integer id,List<CommodityType> allType){
	    //子菜单
	    List<CommodityType> childList = new ArrayList<CommodityType>();
	    for (CommodityType nav : allType) {
	      // 遍历所有节点，将所有菜单的父id与传过来的根节点的id比较
	      //相等说明：为该根节点的子节点。
	      if(nav.getSuperiorId().equals(id)){
	        childList.add(nav);
	      }
	    }
	    //递归
	    for (CommodityType nav : childList) {
	      nav.setChildType(getChild(nav.getId(), allType));
	    }
	    if(childList.size() == 0){
	      return new ArrayList<CommodityType>();
	    }
	    return childList;
	  }
}
