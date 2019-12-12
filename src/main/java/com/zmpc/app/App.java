package com.zmpc.app;

import java.awt.event.ActionListener;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        ActionListener actionListener = event -> System.out.println("Test Lambda");
        //() -> {System.out.println("Test Lambda");};
    }

}
