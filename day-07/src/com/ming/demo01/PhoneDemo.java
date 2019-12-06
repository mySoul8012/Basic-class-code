package com.ming.demo01;

import java.util.Random;

public class PhoneDemo {
    public static void main(String[] args){
        Phone phone = new Phone();
        phone.brand = "ming";
        phone.price = 2342;

        phone.call();

        System.out.println("-------------------");

        phone = new Phone();
        phone.brand = "mingming";
        phone.price = 2242324;
        phone.call();

        while(true){
            phone = new Phone();
            Random random = new Random();
            phone.price = 2322 + random.nextInt();
            phone.brand = "3242" + random.nextInt();
            phone.call();
        }
    }
}
