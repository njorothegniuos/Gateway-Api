/*package com.MBASE;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/api/v1/book/**")
                        .filters(f -> f.rewritePath("/api/v1/book/(?.*)", "/${remains}")
                               // .addRequestHeader("X-first-Header", "first-service-header")
                                .hystrix(c -> c.setName("hystrix")
                                        .setFallbackUri("forward:/fallback/bookhub")))
                        .uri("lb://BookHub-Service/")
                        .id("bookhub-service"))

                .route(r -> r.path("/api/v1/user/**")
                        .filters(f -> f.rewritePath("/api/v1/user/(?.*)", "/${remains}")
                                .hystrix(c -> c.setName("hystrix")
                                        .setFallbackUri("forward:/fallback/user")))
                        .uri("lb://USER-SERVICE/")
                        .id("user-service"))
                .build();
    }

}
*/
