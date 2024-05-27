package com.study.java_study.ch07_클래스02;

public class StudyMain {

    public static void main(String[] args) {
        StudyA a = new StudyA(100, 1000);
        System.out.println(a.num);
        System.out.println(a.num2);
        
        StudyB b = new StudyB();
        b.show();
    }
    
    

}
