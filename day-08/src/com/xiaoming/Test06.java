package com.xiaoming;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args){
        // 判断字符串是否对称
        Scanner scanner = new Scanner(System.in);
        // 输入字符串
        System.out.println("请输入一个字符串");
        StringBuilder res = new StringBuilder(scanner.nextLine());
        // 进行字符串翻转
        StringBuilder res1 = res.reverse();
        // 进行字符串比较
        if(res.toString().equals(res1.toString())){
            // 相等
            System.out.println("此时字符串相等");
        }else{
            System.out.println("此时字符串不相等");
        }
    }
}
