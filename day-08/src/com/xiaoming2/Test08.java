package com.xiaoming2;

public class Test08 {
    public static void main(String[] args){
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }
        System.out.println(parint(numbers));
    }

    public static String parint(int[] arrayList){
        if(arrayList == null){
            return null;
        }

        // 判断个数为0的时候
        if(arrayList.length == 0){
            return "[]";
        }

        // 当个数不为0的时候
        String res = null;
        res = "[";
        for(int i = 0; i < arrayList.length; i++){
            res += arrayList[i];
            res += ",";
        }
        res += "]";

        // 返回拼接的结果
        return res;
    }
}
