package com.mycompany.jerseymvcexam;

import java.util.Set;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.server.mvc.mustache.MustacheMvcFeature;

/**
 *
 * @author hondou
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {
        
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        // Jersey MVC
        resources.add(MustacheMvcFeature.class);
        
        // Rest Resource Classes
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.mycompany.jerseymvcexam.GenericResource.class);
    }
    
}
