
package io.pivotal.workshop;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAuthorizationServer
@SpringBootApplication
public class OauthAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthAuthServerApplication.class, args);
	}
}
