package com.zmpc.entities;

import java.io.Serializable;

/**
 * Created by Alex Show on 13.12.2019.
 *
 * @author Alex Show
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1806909723125376356L;

    private String name;

    private String surname;

    private transient int age;

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
