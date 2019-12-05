package com.ming;

public class Demo02 {
    public static void main(String[] args){

    }

    public static void max(int number01, int number02, int number03){
        int max = number01;
        
        if(max < number02){
            max = number02;
        }

        if(max < number03){
            max = number03;
        }
        return max;
    }
}
