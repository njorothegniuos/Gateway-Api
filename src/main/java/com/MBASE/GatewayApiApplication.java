package com.MBASE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.MBASE.controller"})
@SpringBootApplication
public class GatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApiApplication.class, args);
	}
	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(r -> r.path("/api/v1/book/**")
                        .uri("lb://BOOK-SERVICE/") 
                        .id("book-service"))
				.route(r -> r.path("/api/v1/book/**")
                        .uri("lb://USER-SERVICE/") 
                        .id("user-service"))

                .build();
				/*.route(r -> r.path("/api/v1/book/**")
                        .filters(f -> f.rewritePath("/api/v1/book/(\\{(?:[^{}]|(?1))*\\})", "/${remains}")
                                //.addRequestHeader("X-first-Header", "first-service-header")
                                .hystrix(c -> c.setName("hystrix")
                                        .setFallbackUri("forward:/fallback/bookhub")))
                        .uri("lb://BOOK-SERVICE/")
                        .id("book-service"))
				.route(r -> r.path("/api/v1/user/**")
                        .filters(f -> f.rewritePath("/api/v1/user/(?.*)", "/${remains}")
                                //.addRequestHeader("X-first-Header", "first-service-header")
                                .hystrix(c -> c.setName("hystrix")
                                        .setFallbackUri("forward:/fallback/user")))
                        .uri("lb://USER-SERVICE/")
                        .id("uiser-service"))
                .build();
                */
		
	    }

}
