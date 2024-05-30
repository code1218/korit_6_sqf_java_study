package com.study.java_study.ch12_추상화03;

public class ConstantMain {
    public static void main(String[] args) {
        /*
            상수
            1. 선언과 초기화를 잘 구분해야한다.
            2. 선언 이후에 한번이라도 초기화가 되면 그 다음 부터는 다른 값으로 변경 할 수 없다.
            3. 상수는 가능한 대문자로 표기한다.
            4. 모든 상수명이 대문자이기 때문에 스네이크 표기법을 사용한다.
         */

        int a = 10;
        a = 20;
        final int B;
        B = 30;
//        B = 40;
    }
}
