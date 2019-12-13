package com.zmpc.app;

import com.zmpc.entities.Person;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("Develop Branch code!");

        System.out.println("Added new line 2");

        System.out.println("Added new line 3.1 from Develop");

        System.out.println("Added new line 4.1 from Develop");
		
		System.out.println("Some modifications");

        System.out.println("New Line 01");

        System.out.println("New Line 02");

        System.out.println("New Line 03");

        Person person = new Person();
        person.setName("Alex");
        System.out.println(person);
    }

}
