package com.bibhu.globalfilter.util;

import com.bibhu.globalfilter.exception.ArgumentException;

public class WebPreConditions {
	public static void checkArgument(boolean expression, Object errorMessage){
		if(!expression){
			throw new ArgumentException((String)errorMessage);
		}
	}
}
