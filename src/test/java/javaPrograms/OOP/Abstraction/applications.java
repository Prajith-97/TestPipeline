package javaPrograms.OOP.Abstraction;

public class applications implements modernInterface{

    public static void main(String[] args){
        applications app = new applications();
        app.method1();
        app.method3();
        modernInterface.method2();
    }
    @Override
    public void method1() {
        System.out.println("Implemented method");
    }

//    @Override
//    public void method3() {
//        modernInterface.super.method3();
//        System.out.println("Why????");
//    }
}
