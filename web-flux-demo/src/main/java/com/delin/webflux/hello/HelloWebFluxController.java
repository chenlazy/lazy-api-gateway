/*
package com.delin.webflux.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

*
 * WebFluxController
 *
 * @author: delingChen
 * @version: 1.0-SN
 * @date: 2023/4/8 23:40 星期六


@RestController
@RequestMapping("webFlux/")
public class HelloWebFluxController {

    @Autowired
    private HelloService helloService;

    @GetMapping("hello")
    public String hello() {
        return "hello webflux!";
    }

*
     * Mono在webFlux中是非阻塞的写法
     * Mono 返回0 或 1个元素
     * Flux 返回N个元素，即list列表对象
     * @return


    @GetMapping("/user")
    public Mono<Hello> getUser() {
        Hello hello = new Hello();
        hello.setName("犬小哈");
        hello.setDesc("欢迎关注我的公众号: 小哈学Java");
        return Mono.just(hello);
    }

    @GetMapping("/users")
    public Flux<Hello> getUsers() {
        return Flux.fromIterable(helloService.getHellos());
    }

    @GetMapping(value = "/flux", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Hello> flux() {
        return Flux.fromIterable(helloService.getHellos()).map(hello -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return hello;
        });
    }
}
*/
