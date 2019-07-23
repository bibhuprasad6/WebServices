package com.bibhu.globalfilter.api.application.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bibhu.globalfilter.api.GlobalFilterApi;
import com.bibhu.globalfilter.api.model.Details;
import com.bibhu.globalfilter.api.service.GlobalFilterService;
@Component
public class GlobalFilterApplicationImpl implements GlobalFilterApi{
	@Autowired
	GlobalFilterService globalFilterService;

	@Override
	public Details getDetails_K2(String flightDate, String type) {
		
		return globalFilterService.getDetails(flightDate, type);
	}

	@Override
	public String getDetails_K2() {
		// TODO Auto-generated method stub
		return "success";
	}

}
