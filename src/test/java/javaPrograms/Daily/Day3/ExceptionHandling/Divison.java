package javaPrograms.Daily.Day3.ExceptionHandling;

public class Divison {

    public static double divide(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }

        return (double) a / b;
    }

    public static void main(String[] args) {

        try {
            double result = divide(10, 0);
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
