package com.consul.pp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;


@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class SpringBootSecurityJwtApplication {


    private static final Logger log = LoggerFactory.getLogger(SpringApplication.class);
    public static void main(String[] args) throws UnknownHostException {
//        ConfigurableApplicationContext app = SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
        SpringApplication app = new SpringApplication(SpringBootSecurityJwtApplication.class);
        Environment env = app.run().getEnvironment	();
        log.info("Access URLs:\n----------------------------------------------------------\n\t" +
                "Local: \t\thttp://127.0.0.1:{}\n\t" +
                "External: \thttp://{}:{}\n----------------------------------------------------------",
            env.getProperty("server.port"),
            InetAddress.getLocalHost().getHostAddress(),
            env.getProperty("server.port"));
	}
}
