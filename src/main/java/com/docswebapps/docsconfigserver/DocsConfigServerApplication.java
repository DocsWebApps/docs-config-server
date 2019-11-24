package com.docswebapps.docsconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DocsConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DocsConfigServerApplication.class, args);
    }

}
