package com.ming;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args){
        // 获取键盘输入
        Scanner scanner = new Scanner(System.in);
        // 获取购物金额
        System.out.println("请输入购物金额");
        int money = scanner.nextInt();
        // 获取顾客类别
        System.out.println("请输入顾客类别 0 表示普通顾客  1 表示会员");
        int customerCategory = scanner.nextInt();
        // 进行打折计算
        if(customerCategory == 0){
            // 这是普通顾客
            // 判断购物顾客是否满100元
            if(money < 100){
                System.out.println("不打折");
            }else{
                // 这里进行打折
                System.out.println("这里满199元打9折" + money * 0.9);
            }
        }else if(customerCategory == 1){
            // 这里是会员购物
            if(money < 200){
                // 不满200元打8折
                System.out.println("这里不满200元打折" + money * 0.8);
            }else{
                System.out.println("这里满200元，进行打折" + money * 0.75);
            }
        }

    }
}
