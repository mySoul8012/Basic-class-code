package com.ming.demo01;

public class SStudent {
    public static void main(String[] args){
        Student student = new Student();
        student.setName("ming");
        student.setAge(23);

        student = null;
        System.out.print(student.getAge());
        System.out.print(student.getName());
    }
}
