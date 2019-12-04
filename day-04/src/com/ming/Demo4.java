package com.ming;

public class Demo4 {
    public static void main(String[] args){
        int[] number = {1, 2, 3, 4, 5};
        String res = "";
        for(int i = 0; i < number.length; i++){
            res = res + number[i] + "";
        }
        System.out.println(res);
    }
}
