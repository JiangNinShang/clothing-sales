package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.Information;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface InformationMapper extends Mapper<Information> {

}
