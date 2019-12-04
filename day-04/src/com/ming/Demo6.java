package com.ming;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args){
        int[] number01 = {12,14,23,45,66,68,70,77,90,91};
        Scanner scanner = new Scanner(System.in);
        // 获取要插入的数组
        System.out.println("请您输入下一个数");
        int number02 = scanner.nextInt();
        // 定义插入的数组
        int[] number03 = new int[11];
        // 进行数组的插入
        // 记录插入的位置
        int index = 0;
        for(int i = 0; i < number01.length; i++){
            if(number02 > number01[i]){
                // 正常插入
                number03[i] = number01[i];
                // 记录插入的位置
                index = i + 1;
            }else{
                // 如果number02的值比number01的值小，那么进行插入
                // 插入到后一个位置
                number03[i+1] = number01[i];
            }
        }
        // 进行插入
        number03[index] = number02;
        for(int i = 0; i < number03.length; i++){
            System.out.println(number03[i]);
        }
    }
}
