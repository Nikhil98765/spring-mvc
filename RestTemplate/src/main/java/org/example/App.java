package org.example;

import org.example.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        ClientClass client = new ClientClass();

        client.operations();
    }
}
