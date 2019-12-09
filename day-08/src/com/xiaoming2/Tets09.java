package com.xiaoming2;


public class Tets09 {
    public static void main(String[] args){
        // 统计一文中Java出现的次数
        String text = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        // 进行文本的统计
        // 进行java计数
        int count = 0;
        // 记录当前的Java索引
        int index = 0;
        index = text.indexOf("Java");
        while(text.length() >= 0){
            index = text.indexOf("Java");
            if(index < 0){
                break;
            }
            text = text.substring(index + 4);
            count++;
        }
        System.out.println(count);
    }
}
