package com.ming;

import java.util.Scanner;

public class StringTest02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String line = scanner.nextLine();

        // 遍历字符串
        for(int i = 0; i < line.length(); i++){
            System.out.println(line.charAt(i));
        }
    }
}
