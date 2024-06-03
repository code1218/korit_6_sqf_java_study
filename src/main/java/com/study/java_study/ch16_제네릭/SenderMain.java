package com.study.java_study.ch16_제네릭;

public class SenderMain {

    public static void main(String[] args) {
        // [ Wrapper 자료형 ]
        // Integer                      int
        // Boolean    --(언박싱)-->      boolean
        // Character  <--(박싱)---       char
        // Double                       double
        // Long                         long
        // Float                        float

        Integer num = new Integer(10);  // 박싱
        int num2 = num.intValue();      // 언박싱

        Integer num3 = 20;  // 자동 박싱
        int num4 = num3;    // 자동 언박싱

        Sender<Integer, String, Double> sender1 = new Sender<>(10, "20", 3.14);

    }

}
