package com.microsoft.trysamples.javaapiapp;

import com.wordnik.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * JaxRS application
 */
@ApplicationPath("/api")
public class App extends Application {
    String websitehostname = System.getenv("WEBSITE_HOSTNAME");
    public App(){
        if (websitehostname == null)
            websitehostname = "localhost";
           
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setBasePath("/JavaAPIApp/api");
        beanConfig.setHost(websitehostname);        
        beanConfig.setResourcePackage("com.microsoft.trysamples.javaapiapp");
        beanConfig.setSchemes(new String[]{"http", "https"});
        beanConfig.setScan(true);
    }


}
