package com.ming;


public class Demo6 {
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("hello").append("world").append("java");

        System.out.println(stringBuilder);
        // 反转
        stringBuilder.reverse();

        StringBuilder stringBuilder1 = new StringBuilder("mingming");

        StringBuilder stringBuilder2 = new StringBuilder("mingxiaoming");
        stringBuilder1.reverse();
        stringBuilder2.reverse();
        System.out.println(stringBuilder);
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);

    }
}
