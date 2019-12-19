package com.zmpc.entities;

/**
 * Created by Alex Show on 17.12.2019.
 */
public class Employee extends Person {

    private static final long serialVersionUID = -2477901717232935354L;

    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
