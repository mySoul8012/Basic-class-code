package com.xiaoming;

public class Demo3 {
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            // 判断是否是7的倍数
            if(i % 10 == 0 || i / 10 % 10 == 7 || i % 7 == 0){
                System.out.println(i);
            }
        }
    }
}
