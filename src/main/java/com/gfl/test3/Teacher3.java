package com.gfl.test3;

import lombok.Data;

@Data
public class Teacher3 {

    private Integer id;
    private String name;
    private Integer height;
    private Integer age;

    public Teacher3() {
    }

    public Teacher3(Integer id, String name, Integer height, Integer age) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.age = age;
    }
    
}
