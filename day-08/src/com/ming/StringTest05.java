package com.ming;

import java.util.Scanner;

public class StringTest05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = scanner.nextLine();
        String s = reverse(line);
        System.out.println("s: " + s);
    }

    private static String reverse(String line) {
        String ss = "";
        for(int i = line.length() - 1; i >= 0; i--){
            ss += line.charAt(i);
        }
        return ss;
    }
}
