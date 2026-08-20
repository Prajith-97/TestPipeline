package javaPrograms;

public class logicalOperators {
    public static void main (String[] args) {
        int a = 10;
        int b = 10;
        logicalOperators operators= new logicalOperators();
        operators.logicalAnd(a,b);
        operators.logicalOR(a,b);
        operators.logicalNOT(a,b);
    }
        public void logicalAnd(int a, int b){
            if(a>b && b<a ){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }
    public void logicalOR(int a, int b){
        if(a>b||b<a||b-a<b){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
    public void logicalNOT(int a, int b){
        boolean  flag = false;
        if(a==b){
            System.out.println(!flag);
        }else {
            System.out.println(flag);
        }
    }
}
