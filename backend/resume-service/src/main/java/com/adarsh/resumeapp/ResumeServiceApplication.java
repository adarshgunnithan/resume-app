package com.adarsh.resumeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author 660186
 *
 */
@SpringBootApplication
//@Configuration
public class ResumeServiceApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ResumeServiceApplication.class, args);
	}
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.adarsh.resumeapp.controller")).build();
	}

	/**
	 * Custom meta data
	 * @return ApiInfo
	 */
	private ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo("Spring Boot REST API", "Spring Boot REST API for Resume Application", "1.0",
				"Terms of service", new Contact("Adarsh G Unnithan", "9744835312", "adarshgunnithan2017@gmail.com"),
				"Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0");
		return apiInfo;
	}

}
