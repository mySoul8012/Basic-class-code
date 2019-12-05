package com.xiaoming;
// 百钱百鸡
public class Demo5 {
    public static void main(String[] args){
        // 鸡翁
        for(int i = 0; i <= 20; i++){
            // 鸡母
            for(int j = 0; j <= 20; j++){
                // 鸡雏个数 用100减
                 int z = 100 - i -j;
                // 判断符合条件
                if(z%3 == 0 && 5 * i + 3 * j + z/3 == 100){
                    System.out.println("输出的结果如下" + "鸡翁" + i + "母鸡" + j + "鸡雏"  + z);
                }
            }
        }
    }
}
