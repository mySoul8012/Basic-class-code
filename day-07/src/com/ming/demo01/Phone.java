package com.ming.demo01;

public class Phone {
    String brand;
    int price;

    public void call(){
        System.out.println("用手机打电话" + brand + price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
