package com.study.java_study.ch16_제네릭;

import lombok.ToString;

@ToString
public class Sender2 {
    private String data1;
    private String data2;

    public Sender2(String data1, String data2) {
        this.data1 = data1;
        this.data2 = data2;
    }
}
