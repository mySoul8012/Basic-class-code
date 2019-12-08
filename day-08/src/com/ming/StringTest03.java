package com.ming;

import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String line = scanner.nextLine();
        // 统计字符串个数
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for(int i = 0; i < line.length(); i++){
            char ch = line.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                bigCount++;
            }else if(ch >= 'a' && ch <= 'z'){
                smallCount++;
            }else if(ch >= '0' && ch <= '9'){
                numberCount++;
            }
        }
        // 输出三种类型的字符串个数
        System.out.println("大写字母 " + bigCount);
        System.out.println("小写字母 "  + smallCount);
        System.out.println("数字: " + numberCount);
    }
}
