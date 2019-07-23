package com.bibhu.globalfilter.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibhu.globalfilter.api.model.Details;
import com.bibhu.globalfilter.api.repository.GlobalFilterRepository;
import com.bibhu.globalfilter.api.service.GlobalFilterService;
@Service
public class GlobalFilterServiceImpl implements GlobalFilterService{

	@Autowired
	GlobalFilterRepository globalFilterRepository;
	@Override
	public Details getDetails(String flightDate, String type) {
		// TODO Auto-generated method stub
		return globalFilterRepository.getDetails(flightDate, type);
	}

}
