package com.zerocarbon.plastic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.zerocarbon.plastic.dto.ReuseCupDto;

@Repository
@Mapper
public interface ReuseCupDao {
	List<ReuseCupDto> selectCupList();

}
