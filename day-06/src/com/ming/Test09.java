package com.ming;

public class Test09 {
    public static void main(String[] args){
        int[] number1 = {234,547,435,46,678,345,56,345,65,324,547,345,56,345,4,2,3,5};
        System.out.print(count(number1));
    }

    public static int count(int[] number){
        int count = 0;
        for(int i = 0; i < number.length; i++){
            if((number[i] % 2 == 0) || (number[i] % 3 == 0) || (number[i] % 5 == 0)){
                count++;
            }
        }
        return count;
    }
}
