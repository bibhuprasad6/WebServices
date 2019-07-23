package com.bibhu.globalfilter.api.repository;

import com.bibhu.globalfilter.api.model.Details;


public interface GlobalFilterRepository {
	Details getDetails(String flightDate,String type);
}
