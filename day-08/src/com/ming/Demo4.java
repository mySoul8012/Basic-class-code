package com.ming;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args){
        Phone phone1 = new Phone();
        phone1.setBrand("小米");
        phone1.setPrice(29999);
        phone1.setStyle("ming");
        Phone phone2 = new Phone();
        phone2.setBrand("iphone8");
        phone2.setPrice(588888);
        phone2.setStyle("ming");
        Phone phone3 = new Phone();
        phone3.setBrand("vivo");
        phone3.setStyle("mingming");
        phone3.setPrice(23233);
        ArrayList<Phone> list_phone = new ArrayList<>();
        list_phone.add(phone1);
        list_phone.add(phone2);
        list_phone.add(phone3);

        // 进行获取
        ArrayList<Phone> arrayList = filter(list_phone, 30);
        // 遍历ArrayList
        for(int i = 0; i < arrayList.size(); i++){
            // 进行输出
            System.out.println(arrayList.get(i).getBrand());
        }
    }

    public static ArrayList<Phone> filter(ArrayList<Phone> list, double price){
        ArrayList<Phone> arrayList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            // 进行比较
            if(price < list.get(i).getPrice()){
                // 保存进入另外一个
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }
}
