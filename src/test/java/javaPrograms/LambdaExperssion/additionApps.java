package javaPrograms.LambdaExperssion;

import java.util.function.*;

public class additionApps{
    public static void main(String[] args) {
        addition add = ((num1, num2, num3) -> {
            return num1 + num2 + num3;
        });
        System.out.println(add.add(1, 3, 5));

        Consumer<String> con = str -> System.out.println(str.toLowerCase());
        con.accept("JAVA");

        Predicate<Integer> check = num -> (num > 100);
        System.out.println(check.test(99));

        UnaryOperator<String> str = x -> x.toUpperCase();
        System.out.println(str.apply("hellooo"));

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

        Function<String, String> funexample = s -> {
            return message(s);
        };
        System.out.println(funexample.apply("world"));
    }
        static String message(String s){
        return "Helloo   "+s;
        };

}
