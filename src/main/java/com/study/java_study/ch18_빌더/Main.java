package com.study.java_study.ch18_빌더;

public class Main {
    public static void main(String[] args) {
        // 내부 클래스
        A a = new A();
        A.B b = a.new B();

        a.test();
        b.print();

        A.C c = new A.C();
        c.show();

        A.C.show2();
    }
}
