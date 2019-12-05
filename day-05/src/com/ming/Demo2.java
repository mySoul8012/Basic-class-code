package com.ming;

public class Demo2 {
    public static void main(String[] args){
        System.out.println(max(1, 2, 3));
    }

    public static int max(int number1, int number2, int number3){
        int max1, max2;
        if(number1 < number2){
            max1 = number2;
        }else{
            max1 = number1;
        }

        if(number2 < number3){
            max2 = number3;
        }else{
            max2 = number3;
        }

        if(max1 < max2){
            return max2;
        }else{
            return max1;
        }
    }
}
