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

    }
}
