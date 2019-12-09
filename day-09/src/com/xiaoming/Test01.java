package com.xiaoming;

import java.util.Random;

public class Test01 {
    public static void main(String[] args){
        int[] numberInt = new int[8];
        Random random = new Random();
        // 进行赋值操作
        for(int i = 0; i < numberInt.length; i++){
            numberInt[i] = random.nextInt(10) + 1;
        }
        // 计算平均值
        int sum = 0;
        for (int value : numberInt) {
            sum += value;
        }
        System.out.println("计算出的平均值为 " + sum / numberInt.length);
    }
}
