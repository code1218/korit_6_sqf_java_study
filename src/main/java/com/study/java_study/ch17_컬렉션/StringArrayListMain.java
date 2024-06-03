package com.study.java_study.ch17_컬렉션;

import java.util.*;

public class StringArrayListMain {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        Integer[] n = {1,2,3,4,5};
        
        ArrayList<String> strList = new ArrayList<>();
        strList.add("test1");

        List<Integer> nList = Arrays.asList(n);

        // 배열 <-> 리스트 변환
        List<String> list = Arrays.asList(strArray);
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);
        String[] strArray2 = strList.toArray(new String[strList.size()]);

        // 리스트 값 조회
        System.out.println(strList);

        // contains 포함 여부
        System.out.println(strList.contains("test1"));

        // 리스트 바로 생성
        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println(nums);

        // 제거
        strList.add("김준일");
        strList.add("김준이");
        strList.add("김준삼");
        System.out.println(strList);
        System.out.println(strList.remove("test1"));
        System.out.println(strList);
        System.out.println(strList.remove(1));
        System.out.println(strList);

        System.out.println(nums);
        List<Integer> nums2 = List.of(1,3,5);
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.addAll(nums);
        System.out.println(nums3.removeAll(nums2));
        System.out.println(nums3);

        // 수정
        nums3.set(0, 10);
        System.out.println(nums3);

        nums3.addAll(List.of(1,2,3));
        System.out.println(nums3);

        // 반복
        for(int i = 0; i < nums3.size(); i++) {
            System.out.println(nums3.get(i));
        }

        for(Integer num : nums3) {
            System.out.println(num);
        }

        Iterator<Integer> ir = nums3.iterator();
        while(ir.hasNext()) {
            System.out.println(ir.next());
        }


    }
}
