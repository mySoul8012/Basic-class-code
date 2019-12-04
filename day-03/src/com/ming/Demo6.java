package com.ming;

public class Demo6 {
    public static void main(String[] args){
        for(int i = 1; i < 10; i++){
            System.out.println("兑换一元纸币" + i  + "张" + "兑换5角硬币" + (10 - i) * 2 + "个") ;
        }
    }
}
