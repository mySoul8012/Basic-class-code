package com.ming;

public class Demo7 {
    public static void main(String[] args){
        System.out.print(round(34.54));
    }

    public static int round(double number){
        // 获取小数部分
        int number01 = (int)(number  * 10) % 10;
        // 获取整数部分
        int number02 = (int)number;
        // 判断是否超过五
        if(number01 >= 5){
            // 进行整数部分
           number02++;
           return number02;
        }else{
            return number01;
        }
    }
}
