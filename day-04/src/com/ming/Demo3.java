package com.ming;

import java.util.Random;

public class Demo3 {
    public static void main(String[] args){
        int[] number = new int[6];
        Random random = new Random();
        for(int i = 0; i < number.length; i++){
            number[i] = random.nextInt(100);
            System.out.println(number[i]);
        }
        // 计算和
        int sum = 0;
        for(int i = 0; i < number.length; i++){
            sum += number[i];
        }
        System.out.println(sum);
    }
}
