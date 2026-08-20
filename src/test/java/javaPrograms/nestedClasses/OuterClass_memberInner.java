package javaPrograms.nestedClasses;

public class OuterClass_memberInner {
    private String message = "New Message";

    class inner{
        void innerMethod(){
            System.out.println(message);
        }
    }

    public static void main(String[] args){
        OuterClass_memberInner outer = new OuterClass_memberInner();
        outer.new inner().innerMethod();
    }
}
