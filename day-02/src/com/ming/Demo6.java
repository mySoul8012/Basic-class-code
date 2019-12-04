package com.ming;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args){
        double father = 0.0;
        double mather = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("父亲身高");
        father = scanner.nextInt();
        System.out.println("母亲身高");
        mather = scanner.nextInt();
        // 计算儿子 女儿身高
        double son = (father + mather) * 1.08 / 2;
        double nver = (father * 0.923 + mather) / 2;
        System.out.println("儿子身高" + son);
        System.out.println("女儿身高" + nver);
    }
}
