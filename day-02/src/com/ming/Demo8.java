package com.ming;

public class Demo8 {
    public static void main(String[] args){
        // 定义优惠价购买
        double youhuijia = 16 + 8 + 3;
        double zhekoujia = 24 + 8 + 3;
        if(zhekoujia > 30){
            zhekoujia = zhekoujia * 0.8;
        }
        // 进行比较
        if(youhuijia > zhekoujia){
            System.out.println("折扣价购买划算" + zhekoujia);
        }else{
            System.out.println("优惠价购买划算" + youhuijia);
        }
    }
}
