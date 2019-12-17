package com.zmpc.app;

import com.zmpc.entities.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Main Application Class
 */
public class App {

    private String title = "Title 01";

    {
        title = "Title 02";
    }

    {
        title = "Title 02.2";
    }

    public App() {
        title = "Title 03";
    }

    /**
     * Main method
     * @param args Application arguments
     */
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

        System.out.println("New Line 04");

        System.out.println("New Line 05");

        System.out.println("New Line 06");

        System.out.println("New Line 07");

        System.out.println("New Line 08");

        System.out.println("New Line 09");

        System.out.println("New Line 10");

        Person person = new Person();
        person.setName("Alex");
        person.setAge(30);
        System.out.println(person);

        System.out.println("New Line 11");
        System.out.println(PI);

        List<String> names = new ArrayList<>();
        names.add("Igor");
        names.add("Serge");

        for(String name: names){
            System.out.println(name);
        }

        String[] arrayNames = new String[] {"Oleg", "Alex"};
        for(String name: arrayNames){
            System.out.println(name);
        }

        for (int i = 0; i < 10; i++) {
            // TODO
            System.out.println(i);
        }

        //new Thread(() -> {});

        System.out.println("Enter your Name:");
        Scanner in = new Scanner(System.in);
        person.setName(in.nextLine());

        System.out.println("Your Name is : " + person.getName());


        Date date = new Date();
        LocalDate localDate = LocalDate.of(12,12,12);

        App app = new App();
        System.out.println(app.title);
    }

}
