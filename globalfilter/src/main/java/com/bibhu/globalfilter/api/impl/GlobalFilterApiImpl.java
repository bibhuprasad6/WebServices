package com.bibhu.globalfilter.api.impl;

import static com.bibhu.globalfilter.util.WebPreConditions.checkArgument;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.bibhu.globalfilter.api.GlobalFilterApi;
import com.bibhu.globalfilter.api.application.impl.GlobalFilterApplicationImpl;
import com.bibhu.globalfilter.api.model.Details;

public class GlobalFilterApiImpl implements GlobalFilterApi{

	public GlobalFilterApiImpl(){
		LOGGER.info("Object Created");
	}
	@Autowired
	GlobalFilterApplicationImpl globalFilterApplicationImpl;
	private static final Logger LOGGER= LoggerFactory.getLogger(GlobalFilterApiImpl.class);
	@Override
	public Details getDetails_K2(String flightDate, String type) {
		checkArgument(flightDate != null && !flightDate.isEmpty(), "flightDate cannot be null or empty");
		checkArgument(type != null && !type.isEmpty(), "type cannot be null or empty");
		LOGGER.info("Flight Date info : "+flightDate+" type : "+type);
		LOGGER.debug("Flight Date debug: "+flightDate+" type : "+type);
//		System.out.println("Flight Date : "+flightDate+" type : "+type);
		return globalFilterApplicationImpl.getDetails_K2(flightDate, type);
	}
	@Override
	public String getDetails_K2() {
		// TODO Auto-generated method stub
		LOGGER.debug("Working");
		return "SUCCESS";
	}

}
