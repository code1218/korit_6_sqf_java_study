package com.study.java_study.ch20_람다;

public class AdditionMain {
    public static void main(String[] args) {

        Addition addition = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        int result = addition.add(10, 20);
        System.out.println("결과: " + result);

        Addition addition2 = (x, y) -> x + y;
        result = addition2.add(10, 20);
        System.out.println("결과2: " + result);

    }
}
