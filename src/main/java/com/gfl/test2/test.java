package com.gfl.test2;

import java.util.function.Predicate;

public class test {

    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 195;
        Student student = new Student("9龙", 23, 175);
        System.out.println(
            "9龙的身高高于185吗？：" + predicate.test(student.getHeight())
        );
    }

}
