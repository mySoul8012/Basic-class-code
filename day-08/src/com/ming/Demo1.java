package com.ming;


import java.util.Random;

/*
* 定义 getNewArr()静态方法:要求传入一个int类型的数组arr,遍历数组，将数组中小于10的第一个元素替换成0，然后返回修改之后的数组
在main方法中完成:
1.定义一个长度为5的int类型的数组
2.随机生成5个随机数存入数组(随机数的范围为5到50,包括5和50)，并把数组中的元素打印在控制台
3.调用getNewArr方法,在控制台打印返回后的数组中的元素
*
* */
public class Demo1 {
    public static void main(String[] args){
        int[] newInt = new int[5];
        Random random = new Random();
        for(int i = 0; i < newInt.length; i++){
            newInt[i] = random.nextInt(46) + 5;
        }
        newInt = getNewArray(newInt);
        for(int i = 0; i < newInt.length; i++){
            System.out.println(newInt[i]);
        }
    }

    public static int[] getNewArray(int[] newArray){
        for(int i = 0; i < newArray.length; i++){
            if(newArray[i] < 10){
                newArray[i] = 0;
                break;
            }
        }
        return newArray;
    }
}
