package com.ming;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("mingming");
        list.add("xiaoming");
        list.add("mingrefe");
        list.add("xiaoming");
        list.add(3, "ming");
        System.out.println(list);
    }
}
