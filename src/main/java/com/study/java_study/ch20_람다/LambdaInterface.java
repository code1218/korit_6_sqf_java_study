package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("프로그램 실행");
            System.out.println("프로그램 종료");
        };

        runnable.run();

        Function<String, Integer> fx = s -> Integer.parseInt(s);

        Integer num = fx.apply("10");
        System.out.println("num: " + num);

        Integer num2 = fx.andThen(result -> result + 100).apply("10");
        System.out.println("num2: " + num2);

        Consumer<String> transform = s -> {
            System.out.println(s + "서버에 접속하였음.");
            System.out.println(s + "님 환영합니다.");
        };

        transform.accept("김준일");

        Supplier<Integer> role = () -> {
            Integer result = num + 999;
            return result;
        };

        System.out.println(role.get());

        Predicate<Integer> even = n -> n % 2 == 0;

        System.out.println(even.test(10));


    }
}
