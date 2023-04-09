package com.delin.webflux.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;


/**
 * HelloRouterConfigutation
 *
 * @author: delingChen
 * @version: 1.0-SN
 * @date: 2023/4/9 00:03 星期日
 */
@Configuration
public class HelloRouterConfiguration {

    @Bean
    RouterFunction<ServerResponse> helloRouterFunction(HelloHandler helloHandler) {
        return RouterFunctions.nest(RequestPredicates.path("/webFlux"),
                RouterFunctions.route()
                        .route(RequestPredicates.GET("/hello"), helloHandler::hello)
                        .route(RequestPredicates.GET("/users"), helloHandler::getHellos)
                        .route(RequestPredicates.GET("/user"), helloHandler::getHello)
                        .route(RequestPredicates.GET("/flux"), helloHandler::flux)
                        .build());
    }
}
