package com.xiaoming;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 获取星期数
        System.out.print("请您输入今天的星期数");
        int xinqi = scanner.nextInt();
        if(xinqi == 1){
            System.out.print("星期一 跑步");
        }else if(xinqi == 2){
            System.out.print("周二：游泳");
        }else if(xinqi == 3){
            System.out.print("周三：慢走");
        }else if(xinqi == 4){
            System.out.print("周四：动感单车");
        }else if(xinqi == 5){
            System.out.print("周五：拳击");
        }else if(xinqi == 6){
            System.out.print("周六：爬山");
        }else if(xinqi == 7){
            System.out.print("周日：好好吃一顿");
        }
    }
}
