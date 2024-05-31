package com.study.java_study.ch15_Static;

public class StudentRepository {
    private String[] names;

    private static StudentRepository instance;

    private StudentRepository() {
        names = new String[5];
    }

    public static StudentRepository getInstance() {
        if(instance == null) {
            instance = new StudentRepository();
        }
        return instance;
    }

    public void add(String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }
}









