package com.xiaoming;

public class Demo9 {
    public static void main(String[] args){
       // 进行反转
       int[] number =   {19, 28, 37, 46, 50};
       fanzuang(number);
       print(number);
    }
    public static void fanzuang(int[] number){
        // 定义俩指针
        int left = 0;
        int right = number.length - 1;
        // 数组反转
        // 进行循环，俩指针相等，或相差为1
        while(left - right <= 1){
            // 对数组进行交换
            excend(number, left, right);
            // 指针相减
            left++;
            right--;
            // 判断指针是否溢出
            if(left >= number.length || right <0){
                break;
            }
        }
    }


    // 数组输出
    public static void print(int[] number){
        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }

    // 数组变量交换
    private static void excend(int[] number, int i, int j){
        // 定义临时
        int ninshi = 0;
        // 交换
        ninshi = number[i];
        number[i] = number[j];
        number[j] = ninshi;
    }
}
