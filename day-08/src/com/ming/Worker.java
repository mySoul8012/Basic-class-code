package com.ming;

public class Worker {
    private String name;
    private int age;
    private double salary;

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void worker(){
        System.out.println(this.getName() + " 正在工作");
    }
}
