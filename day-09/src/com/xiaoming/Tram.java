package com.xiaoming;

// 电车类
public class Tram {
    // 品牌
    private String brand;
    // 价格
    private int price;
    // 行驶距离
    private int  operatingRange;
    // get / set 方法

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

    public int getOperatingRange() {
        return operatingRange;
    }

    public void setOperatingRange(int operatingRange) {
        this.operatingRange = operatingRange;
    }
}
