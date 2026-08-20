package javaPrograms.Daily.Day1.Plymorphism;

import javaPrograms.Daily.Day1.EmployeeDetails.CustomException;

public class CardPayment implements Payments{
        @Override
        public void pay(double amount) throws CustomException {

            if (amount <= 0)
                throw new CustomException("Amount must be greater than 0");

            System.out.println("Payment using Card: " + amount);
        }
    }
