package com.ming;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args){
        int[] number1 = {1,3,5,6,8,12,34,45,234,67};
        int[] number2 = new int[11];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number3 = scanner.nextInt();
        // 进行排序
        // 记录当前index
        int index = 0;
        for(int i = 0; i < 10; i++){
            if(number3 < number1[i]){
                index = i;
                break;
            }
        }
        //进行插入
        // 进行插入index
        number2[index] = number3;
        // 定义插入的索引
        int index1 = 0;
        for(int i = 0; i < number2.length; i++){
            if(i <  index){
                number2[i] = number1[i];
            }else if(i > index){
                number2[i] = number1[i - 1];
            }
        }
        for(int i = 0; i < number2.length; i++){
            System.out.println(number2[i]);
        }

    }
}
