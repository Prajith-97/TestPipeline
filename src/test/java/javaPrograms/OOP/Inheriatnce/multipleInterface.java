package javaPrograms.OOP.Inheriatnce;

public class multipleInterface implements interface3{

    @Override
    public void interfaceMethod1() {
        System.out.println("Interface 1");
    }

    @Override
    public void interfaceMethod2() {
        System.out.println("Interface 2");
    }

    @Override
    public void interfaceMethod3() {
        System.out.println("Interface 3");
    }

    public static void main (String[] args){
        multipleInterface m = new multipleInterface();
    }
}
