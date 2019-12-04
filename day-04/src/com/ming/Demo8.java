package com.ming;

import java.util.Random;

public class Demo8 {
    public static void main(String[] args){
        // 生成一个随机数组
        int[] number01 = new int[10];
        // 对数组进行复制
        Random random = new Random();
        for(int i = 0; i < number01.length; i++){
            number01[i] = random.nextInt(100) + 1;
        }
        // 对数组进行判断
        for(int i = 0; i < number01.length; i++){
            for(int j = i; i < number01.length; j++){
                // 判断奇数，偶数，奇数左边，偶数右边
                if(number01[])
            }
        }
    }
}
