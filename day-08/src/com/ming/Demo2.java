package com.ming;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args){
        List<Worker> workerList = new ArrayList<>();
        Worker worker =null;
        for(int i = 0; i < 3; i++){
            worker = new Worker();
            worker.setAge(i);
            worker.setSalary(i + 44);
            worker.setName(i + "ming");
            workerList.add(worker);
        }
        for(int i = 0; i < workerList.size(); i++){
            worker = workerList.get(i);
            System.out.println(worker.getAge());
            System.out.println(worker.getName());
            System.out.println(worker.getSalary());
        }

        // 在索引为1的插入一个集合
        worker = new Worker();
        worker.setName("张柏芝");
        worker.setSalary(3300);
        worker.setAge(35);

        workerList.add(1, worker);

        workerList.remove(3);

        // 打印出所有内容
        for(int i = 0; i < workerList.size(); i++){
            System.out.println(workerList.get(i).getName());
            System.out.println(workerList.get(i).getSalary());
            System.out.println(workerList.get(i).getAge());
        }

    }
}
