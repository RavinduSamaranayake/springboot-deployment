package com.kushan.springbootdeployment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class SpringbootDeploymentApplication {

	@PostConstruct
	public void init(){
		log.info("Application Started.....");
	}

	public static void main(String[] args) {
		log.info("Application executed......");
		SpringApplication.run(SpringbootDeploymentApplication.class, args);
	}

}
