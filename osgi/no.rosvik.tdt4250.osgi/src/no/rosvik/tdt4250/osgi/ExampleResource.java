package no.rosvik.tdt4250.osgi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.osgi.service.component.annotations.*;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

@Component(
	service=ExampleResource.class
)
@JaxrsResource
public class ExampleResource {

	@GET
	@Path("example")
	public String sayHello() {
		return "Hello";
	}

	@GET
	@Path("test")
	public String sayItWorks() {
		return "IT WIRKLS";
	}

	
}
