package com.xiaoming;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        // 录入一个字符串
        System.out.println("请输入一个字符串");
        Scanner scanner = new Scanner(System.in);
        // 获取字符串
        stringBuilder.append(scanner.nextLine());
        // 进行字符串遍历
        // 数字
        int number = 0;
        // 字母
        int zhiMuNumber = 0;
        // 进行遍历
        for(int i = 0; i < stringBuilder.length(); i++){
            if(stringBuilder.toString().charAt(i) >= 'a' && stringBuilder.toString().charAt(i) <= 'z'){
                zhiMuNumber++;
            }

            if(stringBuilder.toString().charAt(i) >= 'A' && stringBuilder.toString().charAt(i) <= 'Z'){
                zhiMuNumber++;
            }
            if(stringBuilder.toString().charAt(i) >= '0' && stringBuilder.toString().charAt(i) <= '9'){
                number++;
            }
        }
        System.out.println(zhiMuNumber);
        System.out.println(number);
    }
}
