package main.dao;

import org.springframework.stereotype.Repository;

import main.domin.Address;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface AddressMapper extends Mapper<Address> {

}
