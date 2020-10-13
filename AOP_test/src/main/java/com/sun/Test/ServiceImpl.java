package com.sun.Test;

import com.sun.Common.LogAnno;
import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements  Service {

    @LogAnno(value = "ababc")
    @Override
    public void go() {
        System.out.println("googogog");
    }
}
