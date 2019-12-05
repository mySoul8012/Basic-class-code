package com.ming;

public class Demo5 {
    public static void main(String[] args){

    }

    public static void print(int number01, int number02, int number03){
        int m = 0;
        int n = 0;
        if(number01 > number02 && number01 > number03){
            System.out.print(number01);
            m = number02;
            n = number03;
        }else if(number02 > number01 && number02 > number03){
            System.out.print(number02);
            m = number01;
            n = number03;
        }else if(number03 > number01 && number03 > number02){
            System.out.print(number03);
            m = number02;
            n = number01;
        }

        // 比较m 和 n
        if(m > n){
            System.out.print(m);
        }else{
            System.out.print(n);
        }
    }
}
