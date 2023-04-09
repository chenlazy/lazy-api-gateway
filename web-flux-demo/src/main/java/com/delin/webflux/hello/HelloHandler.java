package com.delin.webflux.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * HelloHandler
 *
 * @author: delingChen
 * @version: 1.0-SN
 * @date: 2023/4/9 00:00 星期日
 */
@Component
public class HelloHandler {

    @Autowired
    private HelloService helloService;

    public Mono<ServerResponse> getHellos(ServerRequest serverRequest) {
        List<Hello> hellos = helloService.getHellos();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .bodyValue(hellos);
    }

    public Mono<ServerResponse> getHello(ServerRequest serverRequest) {
        Hello hello = new Hello();
        hello.setName("WebFlux Hanlder");
        hello.setDesc("sgafk");
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .bodyValue(hello);
    }

    public Mono<ServerResponse> hello(ServerRequest serverRequest) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .bodyValue("hello WebFlux WebHandler!");
    }

    public Mono<ServerResponse> flux(ServerRequest serverRequest) {
        List<Hello> hellos = helloService.getHellos();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .bodyValue(hellos);
    }
}
