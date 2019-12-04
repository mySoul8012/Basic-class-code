package com.ming;

public class Demo2 {
    public static void main(String[] args){
        double[] number = {12.9,53.54,75.0,99.1,3.14};
        double min = number[0];
        for(int i = 0; i < number.length; i++){
            if(number[i] < min){
                min = number[i];
            }
        }
        System.out.println(min);
    }
}
