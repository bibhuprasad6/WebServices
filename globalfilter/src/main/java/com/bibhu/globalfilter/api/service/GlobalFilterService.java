package com.bibhu.globalfilter.api.service;

import com.bibhu.globalfilter.api.model.Details;


public interface GlobalFilterService {
	Details getDetails(String flightDate,String type);
}
