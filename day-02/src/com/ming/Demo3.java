package com.ming;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args){
        // 获取键盘输入
        Scanner scanner = new Scanner(System.in);
        // 获取存入金额
        int deposits = scanner.nextInt();
        // 获取存入年限
        int depositPeriod = scanner.nextInt();
        // 判断存入金额
        if(deposits < 1000){
            System.out.println("存的金额有误，请重新输入");
            return;
        }

        // 判断保存年限
        double outMoney = 0;
        if(depositPeriod == 1){
            outMoney = deposits + deposits * (2.25 / 100) * 1;
            System.out.println("获取到的本息为" + outMoney);
        }else if(depositPeriod == 2){
            outMoney = deposits + deposits * (2.7 / 100) * 2;
            System.out.println("获取到的本息为" + outMoney);
        }else if(depositPeriod == 3){
            outMoney = deposits + deposits * (3.25 / 100) * 3;
            System.out.println("获取到的本息为" + outMoney);
        }else if(depositPeriod == 5){
            outMoney = deposits + deposits * (3.6 / 100) * 5;
            System.out.println("获取到的本息为" + outMoney);
        }
    }
}
