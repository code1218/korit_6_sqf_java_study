package com.study.java_study.ch08_클래스03;

import com.study.java_study.ch07_클래스02.StudyB;

public class Student {
    private int code;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Student(int code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
