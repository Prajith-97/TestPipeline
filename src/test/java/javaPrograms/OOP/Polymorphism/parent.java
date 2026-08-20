package javaPrograms.OOP.Polymorphism;

public class parent {
    protected  int age = 78;
    protected void travel(){
        System.out.println("travelling....");
    }

    public static void main(String[] args){
        parent p1 = new parent();
        parent p2 = new child();
        parent p3 = new child();

        p1.travel();
        p2.travel();
        p3.travel();

    }
}
