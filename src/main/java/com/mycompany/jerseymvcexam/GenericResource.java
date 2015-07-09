package com.mycompany.jerseymvcexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.server.mvc.Template;

@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    public GenericResource() {
    }
    
    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_HTML)
    @Template(name = "/hello1")
    public Person hello() {
        return new Person("Ms.","Yuko");
    }
    
    @GET
    @Path("mexam")
    @Produces(MediaType.TEXT_HTML)
    @Template(name = "/mexam")
    public MExamBean mexam() {
        MExamBean me = new MExamBean();
        me.setMessage("こんにちわ世界");
        me.setHtml("<font color=\"red\">さようなら世界</font>");
        me.setFlag1(true);
        me.setFlag2(false);
        me.setTeam1(Arrays.asList(new Person[]{
            new Person("Ms.","Yuko"), new Person("Ms.","Kanae"), new Person("Ms.", "Sachi")
        }));
        me.setTeam2(new ArrayList<>());
        
        me.setCopyrights((String input) 
                -> input.replaceAll(
                        "yyyy", 
                        Integer.toString(Calendar.getInstance().get(Calendar.YEAR))));
        return me;
    }
}
