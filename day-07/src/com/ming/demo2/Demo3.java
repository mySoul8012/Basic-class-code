package com.ming.demo2;

public class Demo3 {
    public static void main(String[] args){
        Phone phone = new Phone();
        phone.setBrand("ming");
        phone.setColor("ming");
        phone.setPrice("232");
        System.out.println(phone.getBrand());
        phone.call();
        phone.sendMessage();
    }
}
