package com.markers.infraestructure.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.pattern.PathPattern;

@Configuration
public class CorsConfig {
    
	@Value("${allowed.origin}")
	private String allowedOrigin; 
	@Bean
	public WebMvcConfigurer getCorsConfiguration() {
		
	    	return new WebMvcConfigurer() {
		      @Override
		      public void  addCorsMappings(CorsRegistry registry) {
		    	  registry.addMapping("/**")
		    	           .allowedOrigins(allowedOrigin)
		    	           .allowedMethods("POST","GET","PUT","DELETE")
		    	           .allowedHeaders("*");
		     }
		   };
		}
}