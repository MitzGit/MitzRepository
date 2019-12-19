package com.zmpc.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Alex Show on 13.12.2019.
 *
 * @author Alex Show
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 1806909723125376356L;

    private long id;

    private String name;

    private String surname;

    private transient int age;

    private String address;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return surname != null ? surname.equals(person.surname) : person.surname == null;
    }

@Override
public int hashCode() {
    return Objects.hash(id, name, surname, age);
}

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
