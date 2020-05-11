package dao;

import org.springframework.stereotype.Repository;

import domain.Feedback;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface FeedbackMapper extends Mapper<Feedback> {

}
