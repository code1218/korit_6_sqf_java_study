package com.study.java_study.ch03_함수;

public class FunctionMain03 {

    public static void main(String[] args) {
        Function03 fx = new Function03();
        fx.fx01(1234, "김준일", 31, "01099881916");

        Student student = new Student();
        student.studentCode = 1234;
        student.name = "김준일";
        student.age = 31;
        student.phone = "01099881916";

        fx.fx02(student);
    }

}
