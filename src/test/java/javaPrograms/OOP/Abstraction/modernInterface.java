package javaPrograms.OOP.Abstraction;

public interface modernInterface {


    void method1();                             //classic interface method
    static void method2(){                      //static method
        System.out.println("static method");
    }
   default void method3(){                      //default method
        System.out.println("default");
    }

}
