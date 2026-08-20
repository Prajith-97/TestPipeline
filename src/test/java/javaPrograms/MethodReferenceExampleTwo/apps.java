package javaPrograms.MethodReferenceExampleTwo;


public class apps {

    public static void main (String[] args){
        Sum s = (num1, num2, num3) -> add(num1, num2, num3);
        System.out.println(s.add(1,4,6));

        Sum s2 = apps::add;
        System.out.println(s2.add(1,9,6));

        Sum s3 = (num1, num2, num3) -> add(num1, num2,increment(num3));
        System.out.println(s3.add(10,20,30));
    }

    private static int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    private static int increment(int num){
        num = num+10;
        return num;
    }
}
