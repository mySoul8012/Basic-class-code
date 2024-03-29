package com.xiaoming;

import javax.lang.model.element.NestingKind;
import java.util.Random;
import java.util.Scanner;

// 生成验证码
public class Test02 {
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        // 进行循环添加
        for(int i = 0; i < 26; i++){
            char tmp = 'a';
            tmp += i;
            // 进行添加
            stringBuilder.append(tmp);
        }
        // 进行循环添加A-Z
        for(int i = 0; i < 26; i++){
            char tmp = 'A';
            tmp += i;
            // 进行添加
            stringBuilder.append(tmp);
        }
        // 输出
        System.out.println(stringBuilder);

        // 进行循环添加0-9
        for(int i = 0; i < 10; i++){
            int tmp = 0;
            tmp += i;
            // 进行添加
            stringBuilder.append(tmp);
        }
        // 输出
        Random random = new Random();
        String res = "";
        for(int i = 0; i < 4; i++){
            // 获取四个验证码
            int index = random.nextInt(62);
            res += stringBuilder.toString().charAt(index) + "";
        }
        // 获取用户输入验证码
        System.out.println("请输入验证码");
        // 输出验证码
        System.out.println(res);
        Scanner scanner = new Scanner(System.in);
        String res1 = scanner.nextLine();
        // 判断非空
        if(res1 == null){
            res1 = 0 + "";
        }
        // 进行验证码匹配

        if(res.equals(res1)){
            // 此时验证码匹配
            System.out.println("验证码匹配成功");
        }else{
            System.out.println("验证码匹配失败");
        }
    }
}
