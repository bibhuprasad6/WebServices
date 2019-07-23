package com.bibhu.globalfilter.api.repository.impl;

import org.springframework.stereotype.Repository;

import com.bibhu.globalfilter.api.model.Details;
import com.bibhu.globalfilter.api.repository.GlobalFilterRepository;
@Repository
public class GlobalFilterRepositoryImpl implements GlobalFilterRepository{

	@Override
	public Details getDetails(String flightDate, String type) {
		// TODO Auto-generated method stub
		Details details=new Details();
		details.setAwbNumber("1234");
		details.setSubType("Inbound");
		details.setType("Kiac");
		return details;
	}
	
}
