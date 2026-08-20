package javaPrograms.Exceptions;

public class nestedTry {
        public static void main(String[] args) {
            try {
                System.out.println("Outer try block");

                try {
                    int a = 10 / 0;  // Throws ArithmeticException
                } catch (ArithmeticException e) {
                    System.out.println("Inner catch: " + e);
                }

                int[] arr = new int[3];
                arr[5] = 100;  // Throws ArrayIndexOutOfBoundsException

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Outer catch: " + e);
            }
        }
    }


