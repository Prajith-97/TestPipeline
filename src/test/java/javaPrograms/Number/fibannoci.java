package javaPrograms.Number;

public class fibannoci {
    public static void main(String[] args){
        int num=10;
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(a);
        for(int i=2;i<num;i++){
            int c= a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
