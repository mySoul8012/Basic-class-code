package com.xiaoming;

import java.util.Random;

// 生成验证码，进行验证
public class Test04 {
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
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
        for(int i = 0; i < 4; i++){
            // 获取四个验证码
            int index = random.nextInt(62);
            System.out.print(stringBuilder.toString().charAt(index));
        }

    }
}
