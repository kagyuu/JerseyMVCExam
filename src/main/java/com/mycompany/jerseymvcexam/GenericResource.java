package com.mycompany.jerseymvcexam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.server.mvc.Template;

/**
 * REST Web Service
 *
 * @author hondou
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }
    
    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_HTML)
    @Template(name = "/hello1")
    public Person hello() {
        return new Person("Ms.","Yuko");
    }
}
