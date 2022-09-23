package com.zerocarbon.plastic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerocarbon.plastic.dao.ReuseCupDao;
import com.zerocarbon.plastic.dto.ReuseCupDto;

@Service
public class ReuseCupService {
	@Autowired
	ReuseCupDao reuseCupDao;
	public List<ReuseCupDto> getCup() {
		
		return  reuseCupDao.selectCupList();
		
	}
	
}
