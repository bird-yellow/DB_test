package com.sun.Test2;

import org.springframework.stereotype.Component;

@Component
public class Car {
       public void go(){
           System.out.println("go to beijing");
       }

       public void stop(){
           System.out.println("the car is stop");
       }
}
