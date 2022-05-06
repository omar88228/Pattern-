package it.rest.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("/api")
	public class Configurator extends Application {
	 
	    public Configurator() {
	        init();
	    }
	 
	    private void init() {
	      
	          BeanConfig beanConfig = new BeanConfig();
	          beanConfig.setVersion("1.0.0");
	          beanConfig.setSchemes(new String[]{"http"});
	          beanConfig.setHost("localhost:8080");
	          beanConfig.setBasePath("/swagger-demo/api");
	          beanConfig.setResourcePackage(ImmobileService.class.getPackage().getName());
	          beanConfig.setTitle("RESTEasy, Swagger and Swagger UI Example");
	          beanConfig.setDescription("Sample RESTful API built using RESTEasy, Swagger and Swagger UI");
	          beanConfig.setScan(true);
	    }
}
