package javaPrograms.Daily.Day2.Immutable;

import java.util.Date;

public class Main {

    public static void main(String[] args)  {

        Date date = new Date();

        Employee emp = new Employee(101, "John", "QA", date);

        System.out.println(emp);

        // Try modifying original date
        date.setTime(0);

        System.out.println(emp);   // Object remains unchanged
    }
}

//Rules of Immutable Class (Interview Answer)

//Class must be final
//Fields must be private final
//No setters
//Initialize via constructor
//Return defensive copy for mutable objects
//Do not allow subclassing
//Prefer immutable fields (String, Integer, etc.)