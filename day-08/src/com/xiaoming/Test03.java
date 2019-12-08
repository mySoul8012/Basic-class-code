package com.xiaoming;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args){
        String[] strAyyay = {"ming", "xiaoming", "wefrew", "weregg"};

        for(int i = 0; i < strAyyay.length; i++){
            System.out.println(strAyyay[i]);
        }

        List<String> stringList = new ArrayList<String>();
        stringList.add("ming");
        stringList.add("xiaoming");
        stringList.add("fref");
        for(int i = 0; i < stringList.size(); i++){
            System.out.println(stringList.get(i));
        }

        String str = "xiaomingning";
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
}
