package com.gfl.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        Class aClass = Class.forName("com.gfl.test.Test");
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            Test3 annotation = method.getAnnotation(Test3.class);
            if (annotation != null) {
                System.out.println(annotation.value());
                //执行这个方法
                method.invoke(new Test(), annotation.value());
                System.out.println(25 + 16);
            }
        }
    }
}
