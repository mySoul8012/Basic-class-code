package com.ming;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args){
        int[] arr = {19,28,37,46,50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的数据");
        int number = scanner.nextInt();
        int index = getIndex(arr, number);
        System.out.println("index " + index );
    }

    public static int getIndex(int[] arr, int number){
        int index = -1;
        for(int x = 0; x < arr.length; x++){
            if(arr[x] == number){
                index = x;
                break;
            }
        }
        return index;
    }
}
