package com.gfl.test3;

public class TestTeacher {

    public static void main(String[] args) {

        //这样写，编译器不会报错
            //Teacher  np=new Teacher();
        //这样写，编译器也不会报错
            //Teacher1  np1=new Teacher1();
        //这样写，编译器会报错，原因是无参构造方法被有参构造方法覆盖，编译器不能提供无参构造方法
            //Teacher2  np2=new Teacher2();
        //这样写，编译器不会报错
            //Teacher3  np3=new Teacher3();
        //这样写，编译器不会报错
            //Teacher3  np4=new Teacher3(1,"地球村",null,null);

    }

}
