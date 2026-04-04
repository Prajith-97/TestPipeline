package javaPrograms.nestedClasses;

public class OuterClass_staticNested {
    private static int a =10;
    public int b=20;

    public void print(){
        System.out.println(b);
    }
     static class inner{
         public void print(){
//             System.out.println(b); only outer static member will be accessible
             System.out.println(a);
         }
     }
    public static void main(String[] args){
         OuterClass_staticNested.inner inner = new OuterClass_staticNested.inner();
         inner.print();

    }
}
