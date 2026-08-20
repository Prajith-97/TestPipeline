package javaPrograms.Daily.Day1.Plymorphism;

import javaPrograms.Daily.Day1.EmployeeDetails.CustomException;

public interface Payments {

    void pay(double amount) throws CustomException;

}

//Q1: Why interface used here?
//To achieve loose coupling and allow multiple payment implementations.

//Q2: What polymorphism used?
//Runtime polymorphism (dynamic binding).

