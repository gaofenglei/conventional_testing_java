package com.gfl.test3;

import lombok.Data;

@Data
public class Teacher2 {

    private Integer id;
    private String name;
    private Integer height;
    private Integer age;

    public Teacher2(Integer id, String name, Integer height, Integer age) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.age = age;
    }

}
