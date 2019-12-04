package com.ming;

import java.util.Scanner;

// 个人所得税
public class Demo5 {
    public static void main(String[] args){
        // 获取键盘输入
        Scanner scanner = new Scanner(System.in);
        // 获取金额
        int money = scanner.nextInt();
        double before = 0;
        if(money < 3000){
            System.out.println("税前工资" + money);
            System.out.println("每个月的个税" + money * 0.03);
        }else if(money < 12000){
            System.out.println("税前工资" + money);
            before = 3000 * 0.03 + (money - 3000) * 0.01;
            System.out.println("每个月的个税" + before);
        }else if(money < 25000){
            System.out.println("税前工资" + money);
            before = 3000 * 0.03 + (12000 - 3000) * 0.1 + (money - 12000) * 0.2;
            System.out.println("每个月的个税" + before);
        }else if(money < 35000){
            System.out.println("税前工资" + money);
            before = 3000 * 0.03 + (12000 - 3000) * 0.01 + (12000 - 25000) * 0.20 + (money - 25000) * 0.25;
            System.out.println("每个月的个税" + money);
        }else if(money < 55000){
            System.out.println("税前工资" + money);
            before = 3000 * 0.03 + (12000 - 3000) * 0.01 + (12000 - 25000) * 0.20 + (35000 - 25000) * 0.25 + (money - 35000) * 0.30;
            System.out.println("税前工资" + before);
        }else if(money < 80000){
            System.out.println("税前工资" + money);
            before = 3000 * 0.03 + (12000 - 3000) * 0.01 + (12000 - 25000) * 0.20 + (35000 - 25000) * 0.25 + (55000 - 35000) * 0.30 + (money - 55000) * 0.35;
            System.out.println("税前工资" + money);
        }else{
            System.out.println("超过80000部分");
            before = 3000 * 0.03 + (12000 - 3000) * 0.01 + (12000 - 25000) * 0.20 + (35000 - 25000) * 0.25 + (55000 - 35000) * 0.30 + (35000 - 55000) * 0.35 + (80000 - 55000) * 0.35 + (money - 80000) * 0.45;
            System.out.println(before);
        }
    }
}
