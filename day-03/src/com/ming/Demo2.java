package com.ming;

public class Demo2 {
    public static void main(String[] args){
        for(int year = 1949; year <= 2019; year++){
            if((2019 -year) % 12 == 0){
                System.out.println(year);
            }
        }
    }
}
