package com.xiaoming;

public class Demo6 {
    public static void main(String[] args){
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        // 进行求和
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 10 != 7 && arr[i] / 10 %10 != 7 && arr[i] %2 != 0){
                sum += arr[i];
            }
        }
        System.out.println("输出的值为" + sum);
    }
}
