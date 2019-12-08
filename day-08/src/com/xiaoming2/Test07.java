package com.xiaoming2;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args){
        // 获取用户身份证号
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        // 判断用户输入身份证号是否合法
        // 判断位数
        if(stringBuilder.toString().length() == 18){
            System.out.println("位数不合法");
        }

        // 判断是否以0开头
        if(!(stringBuilder.toString().charAt(0) + "").equals("0")){
            System.out.println("以0开头");
        }

        // 判断前17位是否是数字
        for(int i = 0; i < 17; i++){
            char res = stringBuilder.toString().charAt(i);
            // 判断是否是数字
            if(res >= '0' && res <= '9'){
                // 此时为数字
            }else{
                System.out.println("出现非数字");
                break;
            }
        }

        // 判断最后一位是否是数字，还是大写字母
        char res = stringBuilder.toString().charAt(stringBuilder.length() - 1);
        if(res >= '0' && res <= '9'){;
        }else{
            System.out.println("最后一位不是数字");
        }
        if(res == 'X'){
        }else{
            System.out.println("最后一位不是字母");
        }
    }
}
