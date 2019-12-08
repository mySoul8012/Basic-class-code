package com.xiaoming;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args){
        System.out.println("请您输入工人姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        // 获取工人工龄
        System.out.println("请您输入工人工龄");
        int year = scanner.nextInt();
        // 生成工人对象
        Worker worker = new Worker();
        worker.setName(name);
        worker.setYear(year);
        // 输出工人对象属性
        System.out.println("工人信息如下");
        System.out.println(worker.getName());
        System.out.println(worker.getYear());
    }
}
