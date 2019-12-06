package com.ming.demo2;

import com.ming.demo01.Student;

public class Demo1 {
    public static void main(String[] args){
        Student student = new Student();
        student.setName("ming");
        student.setAge(22);

        System.out.println(student.toString());

        student.setName("fregeg");
        student.setAge(546);
        System.out.println(student.toString());


    }
}
