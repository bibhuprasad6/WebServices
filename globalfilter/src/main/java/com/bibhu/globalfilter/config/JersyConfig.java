package com.bibhu.globalfilter.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.bibhu.globalfilter.api.impl.GlobalFilterApiImpl;
@Component
public class JersyConfig extends ResourceConfig{
	public JersyConfig(){
		System.out.println("Constructor executed");
		register(GlobalFilterApiImpl.class);
	}
}
