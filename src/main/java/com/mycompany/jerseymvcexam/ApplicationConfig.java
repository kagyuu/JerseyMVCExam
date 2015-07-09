package com.mycompany.jerseymvcexam;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.mustache.MustacheMvcFeature;

@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends ResourceConfig {
    
    public ApplicationConfig() {
        this
        .packages(ApplicationConfig.class.getPackage().getName())
        //.property(MustacheMvcFeature.TEMPLATE_BASE_PATH, "/Users/atsushi/templates")
        //.property(MustacheMvcFeature.ENCODING, "UTF-8")
        .register(MustacheMvcFeature.class);
    }    
}
