package com.ming;

import java.util.Scanner;

// 请用户输入一个年龄，如果这个年龄在20--25岁之间，打印：我们约会吧！！
public class Demo9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请用户输入一个年龄");
        int age = scanner.nextInt();
        if(age > 20 && age < 25){
            System.out.println("我们");
        }

    }
}
