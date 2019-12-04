package com.ming;

import java.util.Scanner;

// 模拟计算器
public class Demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 获取输入录入的两个整数
        System.out.println("请输入整数");
        int number01 = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int number02 = scanner.nextInt();
        System.out.println("请输入运算符");
        String yunsuanfu = scanner.next();
        // 打印出
        System.out.println(number01 + yunsuanfu + number02);
        // 进行运算
        switch (yunsuanfu){
            case "+":
                System.out.println(number01 + number02);
                break;
            case "-":
                System.out.println(number01 - number02);
                break;
            case "*":
                System.out.println(number01 * number02);
                break;
            case "/":
                System.out.println(number01 / number02);
                break;
            default:
                System.out.println("您输入的有误");
                break;
        }
    }
}
