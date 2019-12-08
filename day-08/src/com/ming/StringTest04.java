package com.ming;

public class StringTest04 {
    public static void main(String[] args){
        // 定义一个int数组
        int[] arr = {1 , 2, 3};
        long a = 34;

        byte b1 = 10;
        byte b2 = 20;
        byte res = (byte)(b1 + b2);


        String s = arrayToString(arr);
        System.out.println("s : " + s);
    }


    private static String arrayToString(int[] arr) {
        String s = "";
        s += "[";
        for(int i = 0; i < arr.length; i++){
            s += arr[i];
            if(i != arr.length - 1 ){
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
}
