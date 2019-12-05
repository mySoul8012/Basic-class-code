package com.ming;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请您输入一个整数");
        int number = scanner.nextInt();
        print(number);
    }

    public static void print(int number){
        for(int i = 0; i < number; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }
    }

}
