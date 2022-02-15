package com.alumni.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
public class Application implements WebApplicationInitializer, WebMvcConfigurer
{
	/*
	* HELP :
	* 	WebMvcConfigurer
	* @EnableWebMvc, @Configuration
	 * https://stackoverflow.com/questions/27170772/where-to-put-static-files-such-as-css-in-a-spring-boot-project
	* */

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
		root.register(SecurityConfig.class);

		servletContext.addListener(new ContextLoaderListener(root));

		servletContext.addFilter("securityFilter", new DelegatingFilterProxy("springSecurityFilterChain"))
				.addMappingForUrlPatterns(null, false, "/*");
	}

	// =======================================
	// =          Override Methods           =
	// =======================================

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		registry
				.addResourceHandler("/css/**")
				.addResourceLocations("/resources/css/");

		registry.addResourceHandler("/js/**")
				.addResourceLocations("/resources/js/");
	}
}
