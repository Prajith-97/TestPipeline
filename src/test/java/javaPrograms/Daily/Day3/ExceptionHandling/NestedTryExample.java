package javaPrograms.Daily.Day3.ExceptionHandling;

public class NestedTryExample {
    public static void main(String[] args) {

        try {
            System.out.println("Outer Try Started");

            int arr[] = {10, 20, 30};

            try {
                // Inner try — Array exception
                System.out.println(arr[5]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index issue");
            }

            try {
                // Another inner try — Arithmetic exception
                int result = 10 / 0;
            }
            catch (ArithmeticException e) {
                System.out.println("Inner Catch: Division by zero");
            }

            System.out.println("Outer Try Completed");
        }
        catch (Exception e) {
            System.out.println("Outer Catch: " + e.getMessage());
        }
    }
}
