package com.ming;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args){
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);

        for(int x = 0; x < arr.length; x++){
            System.out.println("请输入第" + (x + 1) + "个评委的打分");
            arr[x] = scanner.nextInt();
        }

        // 定义方法实现获取数组中的最高分
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);
        int avg = (sum - max - min) / (arr.length - 2);
        System.out.print("选手的最终得分" + avg);
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int getMin(int[] arr){
        int min = arr[0];
        for(int x = 1; x < arr.length; x++){
            if(arr[x] < min){
                min = arr[x];
            }
        }
        return min;
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int x = 1; x < arr.length; x++){
            if(arr[x] > max){
                max = arr[x];
            }
        }
        return max;
    }

    public static void printArray(int[] arr){
        System.out.println("[");

        for(int x = 0; x < arr.length; x++){
            if(x == arr.length -1){
                System.out.print(arr[x]);
            }else{
                System.out.print(arr[x] + ",");
            }
        }
        System.out.print("]");
    }
}
