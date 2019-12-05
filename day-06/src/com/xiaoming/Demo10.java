package com.xiaoming;

import java.util.Scanner;

// 评分
public class Demo10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入打分");
        int[] number = new int[6];
        for(int i = 0; i < 6; i++){
            System.out.println("请输入第" + i + "个评委打分");
            number[i] = scanner.nextInt();
        }

        // 进行评分
        pinfen(number);
    }

    // 进行评分
    public static void pinfen(int[] number){
        // 去掉最高分
        int max = 0;
        for(int i = 0; i < number.length; i++){
            if(max  < number[i]){
                number[i]  = max;
            }
        }
        // 查找最高分索引
        max = find(number, max);
        System.out.print(max);
        // 最高分为空
        number[max] = 0;

        // 查找最低分
        int min = 0;
        for(int i = 0; i < number.length; i++){
            if(min > number[i]){
                min = number[i];
            }
        }
        // 查找最低分索引
        System.out.print(min);
        min = find(number, min);
        // 最低分为空
        System.out.print(min);
        number[min] = 0;

        // 获取平均分
        int sum = 0;
        for(int i = 0;i < number.length; i++){
            sum += number[i];
        }
        // 进行平均值
        System.out.println(sum / 4);

    }

    // 查找数字索引
    public static int find(int[] number, int findNumber){
        int index = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] == findNumber){
                index = i;
            }
        }
        return index;
    }
}
