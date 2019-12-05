package com.ming;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请您输入行和列");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        print(m, n);
    }
    public static void print(int m, int n){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
