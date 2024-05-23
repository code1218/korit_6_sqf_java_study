package com.study.java_study.ch04_제어;

public class For01 {

    public static void main(String[] args) {
        for(int i = 0; i < 10000; i++) {
            System.out.println(i + 1);
        }

        for(int i = 0; i < 10000; i++) {
            System.out.println(10000 - i);
        }
    }

}
