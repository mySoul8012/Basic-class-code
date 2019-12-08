package com.ming;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args){
        String username = "itheima";
        String password = "czbk";
        for(int i = 0; i < 3; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名: ");
            String name = scanner.nextLine();
            System.out.println("请输入密码");
            String pwd = scanner.nextLine();
            if(name.equals(username) && pwd.equals(password)){
                System.out.println("登录成功");
                break;
            } else {
                if(2 - i == 0){
                    System.out.println("您的账号被锁定，请与管理员联系");
                } else {
                    System.out.println("登录失败, 您还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}
