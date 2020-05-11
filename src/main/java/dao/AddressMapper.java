package dao;

import org.springframework.stereotype.Repository;

import domain.Address;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface AddressMapper extends Mapper<Address> {

}
