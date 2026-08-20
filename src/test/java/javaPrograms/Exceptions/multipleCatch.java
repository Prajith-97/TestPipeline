package javaPrograms.Exceptions;

public class multipleCatch {

        public static void main(String[] args) {
            try {
                int[] arr = new int[3];
                arr[5] = 100;          // ArrayIndexOutOfBoundsException
                int x = 10 / 0;        // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Other Exception: " + e.getMessage());
            }
        }
    }


