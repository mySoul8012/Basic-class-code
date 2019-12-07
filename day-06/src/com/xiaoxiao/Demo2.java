package com.xiaoxiao;

import java.util.Random;

public class Demo2 {
    public static void main(String[] args){
        int[] numberInt = new int[10];
        // 进行数组填充
        Random random = new Random();
        for(int i = 0; i < numberInt.length; i++){
            int randomInt = random.nextInt(100) + 101;
            numberInt[i] = randomInt;
        }
        // 计算奇数索引的和
        int sum = 0;
        for(int i = 0; i < numberInt.length; i++){
            // 判断是否是奇数
            if(i % 2 != 0){
                sum += numberInt[i];
            }
        }
        System.out.println(sum);

    }


}
