package javaPrograms.OOP.Inheriatnce;

public class child extends parent {
    private void childMethod1(){
        System.out.println("Child Method 1");
    }

    protected void childMethod2(){
        System.out.println("Child Method 2");
    }

    public static void main(String[] args){
        child c = new child(); //single inheritance
        grandChild gc = new grandChild(); //multilevel
    }
}
