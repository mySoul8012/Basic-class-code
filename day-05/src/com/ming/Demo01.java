package com.ming;

public class Demo01 {
    public static void main(String[] args){
        System.out.println(min(0,1));
    }
    public static int min(int number01, int number02){
        if(number01 < number02){
            return number01;
        }else{
            return number02;
        }
    }
}
