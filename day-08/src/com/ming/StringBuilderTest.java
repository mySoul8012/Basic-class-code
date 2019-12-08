package com.ming;

import java.util.Scanner;

public class StringBuilderTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = scanner.nextLine();
        String s = myReverse(line);
        System.out.println("s: " + s);
    }

    /**
     * 定义方法实现字符串反转

     * @param line
     * @return
     */
    private static String myReverse(String line) {
        return new StringBuilder(line).reverse().toString();
    }
}
