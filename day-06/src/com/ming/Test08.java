package com.ming;

public class Test08 {
    public static void main(String[] args){
        int[] arr = {1, 43, 2, 5, 432, 4, 52, 432, 4325, 4414};
        System.out.print(count(arr));
    }

    public static int count(int[] arr){
        int count = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
