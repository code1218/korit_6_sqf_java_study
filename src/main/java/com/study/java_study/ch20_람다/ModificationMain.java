package com.study.java_study.ch20_람다;

public class ModificationMain {

    public static void main(String[] args) {
        Modification<String> m1 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) {
                System.out.println("기존데이터: " + oldData);
                System.out.println("새로운데이터: " + newData);
                return newData;
            }
        };

        Modification<String> m2 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) {
                return newData;
            }
        };

        Modification<String> m3 = (oldName, newName) -> newName;


        String name = "김준일";
        String newName = m1.modify(name, "김준이");
        System.out.println(newName);

        String newName2 = m2.modify(name, "김준삼");
        System.out.println(newName2);

        String newName3 = m3.modify(name, "김준사");
        System.out.println(newName3);
    }

}
