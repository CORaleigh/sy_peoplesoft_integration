package gov.raleighnc.switchyard.integration.service.peoplesoft.peoplesoft_integration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
public interface PsftRestInterface {

	@GET
	@Path("/fromDate/{fromDate}")
	@Produces({"application/xml"})
	public ItemsList getNewMaterialItemsList(@PathParam("fromDate") String fromDate);
	
	//TODO? - add no-param interface 
}
