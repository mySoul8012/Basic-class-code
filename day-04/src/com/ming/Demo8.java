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
        // 定义一个空数组
        int[] number03 = new int[10];
        // 定义俩个指正
        int left = 0;
        int right = 9;
        // 进行判断
        for(int i = 0; i< number03.length; i++){
            if(number03[i] %2 == 0){
                // 这是偶数
                 number03[left] = number01[i];
                left++;
            }else{
                number03[right] = number01[i];
                right--;
            }
        }
        // 打印出以后的
        for(int i = 0; i < number03.length; i++){
            System.out.println(number03[i]);
        }
    }
}
