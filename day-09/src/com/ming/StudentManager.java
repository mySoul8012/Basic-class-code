package com.ming;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        // 定义集合，存储所有学员信息
        ArrayList<Student> studentArrayList = new ArrayList<>();

        // 用循环完成再次回到主界面
        while(true) {
            // 生成主界面
            System.out.println("------欢迎来到学生管理系统-----");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择: ");

            // 使用Scanner录入键盘数据
            Scanner scanner = new Scanner(System.in);
            int line = scanner.nextInt();

            // 使用switch语句进行操作选择
            switch (line){
                case 1:
                    addStudent(studentArrayList);
                    break;
                case 2:
                    // 删除学员
                    remove(studentArrayList);
                    break;
                case 3:
                    // 修改学员
                    xuigai(studentArrayList);
                    break;
                case 4:
                    select(studentArrayList);
                    break;
                case 5:
                    System.out.println("谢谢使用");
                    System.exit(0); // 退出 Jvm
            }
            System.out.println(studentArrayList.size());
        }
    }

    // 修改学员
    private static void xuigai(ArrayList<Student> studentArrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("进行学员修改");
        System.out.println("请输入学员学号");
        String numberInt = scanner.next();
        Student student = null;
        // 获取学生对象
        for (Student value : studentArrayList) {
            if (value.getId().equals(numberInt)) {
                student = value;
                // 进行学生修改
                System.out.println("请输入学生姓名");
                String name = scanner.next();
                student.setName(name);
                System.out.println("请输入学生年龄");
                int age = scanner.nextInt();
                student.setAge(age);
                System.out.println("请输入学生地址");
                String address = scanner.next();
                student.setAddress(address);
                System.out.println("修改完成");
                return;
            }
        }
    }

    // 查询学员
    private static void select(ArrayList<Student> studentArrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("进行学员查询");
        for (Student student : studentArrayList) {
            System.out.println("学生姓名: " + student.getName() + "\n学生学号: " + student.getId() + "\n学生年龄: " + student.getAge() + "\n学生居住地: " + student.getAddress());
        }
    }

    // 删除学员
    private static void remove(ArrayList<Student> studentArrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学员学号");
        String sid = scanner.next();
        // 获取学生对象
        for(int i = 0; i < studentArrayList.size(); i++){
           if(studentArrayList.get(i).getId().equals(sid)){
               studentArrayList.remove(i);
           }
        }
    }

    // 添加学员
    private static void addStudent(ArrayList<Student> studentArrayList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入学员学号");
        String sid = scanner.next();
        System.out.println("请输入学生姓名");
        String name = scanner.next();
        System.out.println("请输入学生年龄");
        int age = scanner.nextInt();
        System.out.println("请输入学生居住地");
        String address = scanner.next();

        // 创建学生对象，键盘录入数据赋值
        Student student = new Student();
        student.setId(sid);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);

        studentArrayList.add(student);

        // 给出添加成功提示
        System.out.println("添加学生成功");
    }
}
