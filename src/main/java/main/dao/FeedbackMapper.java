package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.Feedback;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
public interface FeedbackMapper extends Mapper<Feedback> {

}
