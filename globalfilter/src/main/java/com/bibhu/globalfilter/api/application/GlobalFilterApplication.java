package com.bibhu.globalfilter.api.application;

import com.bibhu.globalfilter.api.model.Details;


public interface GlobalFilterApplication {
	Details getDetails(String flightDate,String type);
}
