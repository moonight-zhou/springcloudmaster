package com.winner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//      new SpringApplicationBuilder(EurekaClientApplication.class).web(true).run(args);
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}


