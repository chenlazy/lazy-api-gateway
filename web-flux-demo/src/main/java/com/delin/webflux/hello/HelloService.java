package com.delin.webflux.hello;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * HelloService
 *
 * @author: delingChen
 * @version: 1.0-SN
 * @date: 2023/4/8 23:50 星期六
 */
@Service
public class HelloService {

    public List<Hello> getHellos() {
        List<Hello> hellos = new ArrayList<>();

        Hello hello = new Hello();
        hello.setName("webFlux");
        hello.setDesc("webFlux");
        hellos.add(hello);

        Hello hell = new Hello();
        hell.setName("webFlux1");
        hell.setDesc("webFlux1");
        hellos.add(hell);
        return hellos;
    }
}
