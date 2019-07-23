package com.bibhu.globalfilter.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.bibhu.globalfilter.api.model.Details;


@Path("/gbl")
public interface GlobalFilterApi {
	@GET
	@Path("/{flightDate}/{type}/K2")
	@Produces(MediaType.APPLICATION_JSON)
	Details getDetails_K2(@PathParam("flightDate")String flightDate,@PathParam("type")String type);
	@GET
	@Path("/test")
	String getDetails_K2();
}
