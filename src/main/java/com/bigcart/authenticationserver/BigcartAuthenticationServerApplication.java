package com.bigcart.authenticationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class BigcartAuthenticationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigcartAuthenticationServerApplication.class, args);
    }

}
