package com.xiaoming2;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setAge(12);
        student.setName("xiaoming");
        students.add(student);
        student = new Student();
        student.setName("xiaomingming");
        student.setAge(45);
        students.add(student);
        System.out.println(students.size());
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getAge() + students.get(i).getName());
        }

    }
}
