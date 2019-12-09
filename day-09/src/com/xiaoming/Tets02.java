package com.xiaoming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tets02 {
    public static void main(String[] args){
        // 生成三个电车对象
        Tram tram = new Tram();
        Tram tram1 = new Tram();
        Tram tram2 = new Tram();
        Random random = new Random();
        // 进行赋值操作
        tram.setBrand("品牌1");
        tram.setOperatingRange(random.nextInt(2001));
        tram.setPrice(232);
        tram1.setPrice(234);
        tram1.setOperatingRange(random.nextInt(2001));
        tram1.setBrand("品牌2");
        tram2.setBrand("品牌3");
        tram2.setOperatingRange(random.nextInt(2001));
        tram2.setPrice(434);
        // 放入集合中
        List<Tram> arrayList = new ArrayList<>();
        // 进行插入
        arrayList.add(tram);
        arrayList.add(tram1);
        arrayList.add(tram2);
        // 查找行驶距离10000以下的电车
        if(findCard(arrayList)){
            System.out.println("查找到距离10000以下的电车");
        }else{
            System.out.println("未查找到距离1000以下的电车");
        }
    }

    /**
     * 查找10000以下的电车
     * @param arrayList
     * @return
     */
    public static boolean findCard(List<Tram> arrayList){
        // 进行循环遍历
        for (Tram tram : arrayList) {
            if (tram.getOperatingRange() < 1000) {
                // 如果查找到直接返回
                return true;
            }
        }
        return false;
    }
}
