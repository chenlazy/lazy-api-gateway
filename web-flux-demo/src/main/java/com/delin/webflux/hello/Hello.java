package com.delin.webflux.hello;

import java.io.Serializable;

/**
 * Hello
 *
 * @author: delingChen
 * @version: 1.0-SN
 * @date: 2023/4/8 23:46 星期六
 */
public class Hello implements Serializable {

    private static final long serId = 1328797698L;

    private String name;

    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
