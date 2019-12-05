package com.xiaoming;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args){
        int[] arr = {19, 28, 37, 46, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个查找的数据");
        int number = scanner.nextInt();
        // 查找该数据
        for(int i = 0; i < arr.length; i++){
            // 进行查找索引
            if(arr[i] == number){
                System.out.print("查找到的索引为 " + i + 1);
            }
        }
     }
}
