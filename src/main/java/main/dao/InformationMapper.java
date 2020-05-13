package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.Information;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface InformationMapper extends Mapper<Information> {

}
