package com.ming;

public class Demo7 {
    public static void main(String[] args){
        // 保存股票的
        double[] gupiao = {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};
        // 定义赚钱
        int zuanqian = 0;
        // 定义赔钱
        int peiqian = 0;
        // 进行统计
        for(int i = 0; i < gupiao.length; i++){
            if(gupiao[i] < 0){
                peiqian++;
            }else if(gupiao[i] > 0){
                zuanqian++;
            }else{
                System.out.println();
            }
        }
        // 输出统计结果
        System.out.println("赚钱股票" + zuanqian);
        System.out.println("赔钱股票" + peiqian);
    }
}
