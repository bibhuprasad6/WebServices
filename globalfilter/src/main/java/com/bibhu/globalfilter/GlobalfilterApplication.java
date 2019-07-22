package com.bibhu.globalfilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GlobalfilterApplication {

	private static final Logger LOGGER= LoggerFactory.getLogger(GlobalfilterApplication.class);
	public static void main(String[] args) {
		LOGGER.debug("Application Started");
		SpringApplication.run(GlobalfilterApplication.class, args);
	}

}
