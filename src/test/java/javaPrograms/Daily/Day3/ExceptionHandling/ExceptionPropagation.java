package javaPrograms.Daily.Day3.ExceptionHandling;

public class ExceptionPropagation {
    void method3() {
        int result = 10 / 0;   // Exception occurs here
    }

    void method2() {
        method3();   // Not handled here → propagated
    }

    void method1() {
        method2();   // Not handled here → propagated
    }

    public static void main(String[] args) {

        ExceptionPropagation obj = new ExceptionPropagation();

        try {
            obj.method1();
        }
        catch (ArithmeticException e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }
}
