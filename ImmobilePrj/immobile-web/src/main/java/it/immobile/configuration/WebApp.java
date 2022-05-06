package it.immobile.configuration;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import io.swagger.jaxrs.config.BeanConfig;
import it.immobile.service.RestService;

@ApplicationPath("/api")
public class WebApp extends Application{
	public WebApp() {
		init();
	}
	private void init() {      
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[]{"http"});
        beanConfig.setHost("localhost:8080");
        beanConfig.setBasePath("/immobile-web/api");
        beanConfig.setResourcePackage(RestService.class.getPackage().getName());
        beanConfig.setTitle("App immobile REST API");
        beanConfig.setScan(true);
  }
}
