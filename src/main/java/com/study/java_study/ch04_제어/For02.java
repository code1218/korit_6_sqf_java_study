package com.study.java_study.ch04_제어;

public class For02 {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++) {
            System.out.println(i + 1 + "일차");
            for(int j = 0; j < 10 * (i + 1); j++) {
                System.out.println("줄넘기: " + (j + 1) + "개");
            }
        }
    }
}
