package com.appspot.bootstrap4gwt.shared.model;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long age;
    private String name;
    private String address;
    private String sex;
    
    public Person() {
    }
    
    public Person(Long age, String name, String address, String sex) {
        super();
        this.age = age;
        this.name = name;
        this.address = address;
        this.sex = sex;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
