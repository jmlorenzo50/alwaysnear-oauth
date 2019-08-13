package es.alwaysnear.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AlwaysnearOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlwaysnearOauthApplication.class, args);
	}

}
