package com.ming;

public class Demo9 {
    public static void main(String[] args){
        // 分钟
        int mine = 1;
        // 容量
        int rongnian = 0;
        // 灌水的速度
        int guansuishudu = 1;
        while(rongnian < 10){
            // 分钟++
            mine++;
            // 流水
            if(rongnian <= 3){
                rongnian = 0;
            }
            // 灌水
            rongnian = rongnian + guansuishudu;
            // 灌水速度++
            guansuishudu++;
        }
        System.out.println(mine);
    }
}
