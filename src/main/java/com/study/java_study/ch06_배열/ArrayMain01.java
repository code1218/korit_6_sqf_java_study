package com.study.java_study.ch06_배열;

public class ArrayMain01 {

    public static void main(String[] args) {
        int[] nums = new int[100];

        for(int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }

        for(int num : nums) {
            System.out.println(num);
        }

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                continue;
            }
            int num = nums[i];
            System.out.println(num);
        }
    }

}
