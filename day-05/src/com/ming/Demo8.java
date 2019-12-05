package com.ming;

import java.util.Random;

public class Demo8 {
    public static void main(String[] args){
        int[] number01 = {2,588,888,1000,10000};
        System.out.print(coujian(number01) + "奖金已经抽出");
    }

    public static int coujian(int[] number01){
        Random random = new Random();
        int randomNumber = random.nextInt(5);
        return number01[randomNumber];
    }
}
