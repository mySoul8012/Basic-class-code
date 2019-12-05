package com.xiaoming;

public class Demo4 {
    public static void main(String[] args){
        int[] number = new int[20];
        number[0] = 1;
        number[1] = 1;
        // 计算兔子对数
        for(int i = 2; i < number.length; i++){
            number[i] = number[i - 2] + number[i - 1];
        }
        // 输出最后一个
        System.out.print(number[19]);
    }
}
