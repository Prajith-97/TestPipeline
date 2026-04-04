package javaPrograms;

public class ternaryOperator {
    public static void main (String[] args) {
        int a = 30;
        int b = 20;
        ternaryOperator operators= new ternaryOperator();
        operators.ternary(a,b);

    }
    public void ternary(int a, int b){
       int result = a>b?a:b;
       System.out.println(result);
    }
}
