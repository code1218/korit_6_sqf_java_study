package com.study.java_study.ch14_Object;

import java.util.Objects;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter and setter


    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj.getClass() == this.getClass()) {
            Student student = (Student) obj;
            return Objects.equals(student.name, name) && Objects.equals(student.age, age);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
