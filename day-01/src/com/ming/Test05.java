package com.ming;

public class Test05 {
    public static void main(String[] args){
        int a = 10;
        {
            a = 20;
            System.out.println(a);
        }

        {
            int b = 20;
            System.out.println(b);
        }

        int b = 30;
        System.out.println(b);

    }

}
