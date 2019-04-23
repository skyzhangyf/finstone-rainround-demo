package com.finstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-providers.xml"})
public class FinstoneDubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run ( FinstoneDubboProviderApplication.class, args );
    }

}
