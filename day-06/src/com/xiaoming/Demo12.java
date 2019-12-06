package com.xiaoming;

import java.util.Arrays;
import java.util.Random;

public class Demo12 {
    public static void main(String[] args){
        // 生成随机数
        int[] numberInt = toNewArray();
        // 打印
        for(int i = 0; i < numberInt.length; i++){
            System.out.println(numberInt[i]);
        }
    }

    // 生成10个长度的数组
    public static int[] toNewArray(){
        // 生成数组
        int[] numberInt = new int[20];
        // 依次添加
        for(int i = 0; i < numberInt.length; i++){
            numberInt[i] = i;
        }
        // 随机打乱
        for(int i = 0; i < numberInt.length; i++){
            // 生成随机数
            Random random = new Random();
            // 进行随机交换
            int index = random.nextInt(20);
            int temp = numberInt[index];
            numberInt[index] = numberInt[i];
            numberInt[i] = temp;
        }
        // 截取前10位
        return Arrays.copyOfRange(numberInt, 0, 10);
    }
}
