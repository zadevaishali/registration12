package com.example.registrstion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebConfig implements WebMvcConfigurer {
@Bean
	public WebMvcConfigurer corsConfiguration() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry){
				registry.addMapping("/**").allowedOrigins("http://localhost:3000")
				.allowedHeaders("GET","POST","PUT","DELETE").allowedHeaders("*").allowCredentials(true);
				};
		};
		
		
	}

}
