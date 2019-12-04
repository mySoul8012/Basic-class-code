package com.ming;


public class Demo7 {
    public static void main(String[] args){
        // 定义红茶妹妹的钱
        int red = 21;
        int gree = 24;
        // 对钱数进行计算
        red = red * 2 + 3;
        gree = gree * 2;
        // 判断钱数是否一样
        if(red == gree){
            // 两者钱数相同
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
