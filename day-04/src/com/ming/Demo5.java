package com.ming;

public class Demo5 {
    public static void main(String[] args){
        int[] number = {72,89,65,87,91,82,71,93,76,68};
        int sum = 0;
        for(int i = 0; i < number.length; i++){
            sum += number[i];
        }
        // 求平均数
        System.out.println(sum / number.length);
    }
}
