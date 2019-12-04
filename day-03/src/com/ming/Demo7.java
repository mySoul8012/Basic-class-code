package com.ming;

// 使用while循环完成
public class Demo7 {
    public static void main(String[] args){
        int i = 1988;
        while(i <= 2019){
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                System.out.println("这是闰年" + i);
            }
            i++;
        }
    }
}
