package dao;

import org.springframework.stereotype.Repository;

import domain.Information;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface InformationMapper extends Mapper<Information> {

}
