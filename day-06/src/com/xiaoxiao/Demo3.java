package com.xiaoxiao;

import java.util.Random;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args){
        String[] stringNumber = new String[10];
        Scanner scanner = new Scanner(System.in);
        // 接收10个字符
        for(int i = 0; i < 10; i++){
            // 接收10个字符
            System.out.println("接收10个字符");
            stringNumber[i] = scanner.next();
        }

        // 随机抽取4个字符
        String[] res = extract(stringNumber);
        // 打印出长度
        System.out.println(res.length);
        // 打印出
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }

    }

    // 定义方法随机抽取4个字符
    public static String[] extract(String[] arrayString){
        Random random = new Random();
        String[] res = new String[4];
        for(int i = 0; i < 4; i++){
            int index = random.nextInt(10);
            // 获取字符串
            res[i] = arrayString[index];
        }
        return res;
    }
}
