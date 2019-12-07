package com.ming.demo2;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        String line = "1-2-3-4";
        String[] arr = line.split("-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i+1]);
        }
    }
}
