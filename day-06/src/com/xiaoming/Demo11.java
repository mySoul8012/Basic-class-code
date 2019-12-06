package com.xiaoming;

public class Demo11 {
    public static void main(String[] args){
        char[] chArray = {'a', 'b', '7', 'A', '0', '你', '好', '9'};
        int sum = 0;
        for(int i = 0; i < chArray.length; i++){
            if(!Character.isDigit(chArray[i])){
                sum++;
            }
        }
        System.out.print(sum);
    }




}
