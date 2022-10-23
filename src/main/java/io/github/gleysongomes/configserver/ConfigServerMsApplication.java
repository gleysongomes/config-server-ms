package io.github.gleysongomes.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerMsApplication.class, args);
	}

}
