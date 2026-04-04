package javaPrograms.nestedClasses;

public class OuterClass_localInner {
    private String str = "name";
    public void outerMethod(){
        int a = 10;
        class innerClass{
            public void printMessage(){
//                a=20; this action won't be possible as 'a' variable is to final
                System.out.println(str);
                System.out.println(a);
            }
        }
        innerClass inner = new innerClass();
        inner.printMessage();
    }

    public static void main(String[] args){
        OuterClass_localInner outer = new OuterClass_localInner();
        outer.outerMethod();
    }

}
