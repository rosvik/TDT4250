package no.rosvik.tdt4250.osgi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.osgi.service.component.annotations.*;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;


@Component(
    service = ExampleAddon.class
)
@JaxrsResource
public class ExampleAddon {

    @GET
    @Path("/tester/{name}")
    public String sayHello(@PathParam("name") String name) {
        return "Hello " + name;
    }

}