package javaPrograms.LambdaExperssion;

@FunctionalInterface
public interface addition {
    public int add(int num1, int num2, int num3);
    static void staticMethod1(){
        System.out.println("Method 1");
    }
}
