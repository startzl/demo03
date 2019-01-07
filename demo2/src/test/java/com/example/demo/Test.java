package com.example.demo;

import java.util.Scanner;

/**
 * Created by tym on 2018/5/23 0023.
 */
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 0; 		//雏鸡数
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 33; j++) {
                k = 3*(100 - 5*i - 3*j);
                if(i + j + k ==100 && k % 3 == 0) {
                    System.out.println("公鸡："+i+"母鸡："+j+"雏鸡："+k);
                }
            }
        }
    }
}
