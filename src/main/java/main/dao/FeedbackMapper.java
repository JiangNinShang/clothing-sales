package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.Feedback;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface FeedbackMapper extends Mapper<Feedback> {

}
