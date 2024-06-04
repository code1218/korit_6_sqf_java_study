package com.study.java_study.ch17_컬렉션;

public class BookMain {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        BookService.getInstance().run1();

        System.out.println("프로그램 종료");
    }
}
