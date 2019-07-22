package com.bibhu.globalfilter.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/gbl")
public interface GlobalFilterApi {
	@GET
	@Path("/{flightDate}/{type}/K2")
	String getDetails_K2(@PathParam("flightDate")String flightDate,@PathParam("type")String type);
	@GET
	@Path("/test")
	String getDetails_K2();
}
