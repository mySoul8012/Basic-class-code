package com.ming;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 获取数字
        System.out.println("请输入三个数字");
        int number01 = scanner.nextInt();
        int number02 = scanner.nextInt();
        int number03 = scanner. nextInt();
        // 最小值
        int min = 0;
        if(number01 < number02 && number01 < number03){
            min = number01;
        }else if(number02 < number01 && number02 < number03){
            min = number02;
        }else if(number03 < number01 && number03 < number02){
            min = number03;
        }
        System.out.println("最小值为" + min);
        
    }
}
