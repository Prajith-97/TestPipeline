package javaPrograms.Daily.Day1.Plymorphism;

import javaPrograms.Daily.Day1.EmployeeDetails.CustomException;
import javaPrograms.Daily.Day1.EmployeeDetails.Employee;

public class PaymentMain {
    public static void main(String[] args){
        try{
            Payments pc= new CardPayment();
            pc.pay(899.00);

            Payments pu= new UPIPayment();
            pu.pay(-899.00);
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }


    }
}
