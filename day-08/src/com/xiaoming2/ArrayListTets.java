package com.xiaoming2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTets {
    public static void main(String[] args){
        ArrayList<Student> arrayList = new ArrayList<Student>();
        addStudent(arrayList);
        addStudent(arrayList);
        addStudent(arrayList);
        addStudent(arrayList);
        addStudent(arrayList);
        addStudent(arrayList);
        addStudent(arrayList);
        // 遍历集合
        for(int i = 0;i < arrayList.size(); i++){
            System.out.println(arrayList.get(i).getAge() + arrayList.get(i).getName());
        }
    }

    private static void addStudent(ArrayList<Student> arrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = scanner.nextLine();
        // 输入学生年龄
        System.out.println("请输入学生年龄");
        int age = scanner.nextInt();
        // 生成学生对象，录入集合
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        // 集合添加对象
        arrayList.add(student);
    }
}
