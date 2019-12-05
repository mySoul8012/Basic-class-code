package com.xiaoming;

public class Demo7 {
    public static void main(String[] args){
        // 定义俩数组
        int[] number01 = new int[10];
        int[] number02 = new int[10];
        // 进行判断
        System.out.print(compare(number01, number02));
    }
    public static boolean compare(int[] number1, int[] number2){
        // 判断长度
        if(number1.length != number2.length){
            return false;
        }

        // 判断元素
        for(int i = 0; i < number1.length; i++){
            for(int j = 0; j < number2.length; j++){
                // 判断元素是否相同
                if(number1[i] == number2[i]){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
}
