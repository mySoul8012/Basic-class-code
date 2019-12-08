package com.ming;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("ming");

        // 删除
        list.remove("ming");

        // 改
        list.add("xiaomingming");
        list.set(0, "xiaoming");

        // 查
        list.get(0);

        // 打印
        System.out.println(list);
    }
}
