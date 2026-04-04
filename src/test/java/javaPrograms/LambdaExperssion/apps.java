package javaPrograms.LambdaExperssion;

public class apps {
 public static void main (String[] args){

    sum s = (num1, num2) -> {return num1+num2;};
    System.out.println(s.add(10,20));

    greeting g =msg -> System.out.println("Hello Lambda"+msg);
    g.sayHello("JAVA");

//    if no parameters in functional interface
//    greeting g = () -> System.out.println("Hello Lambda");
//    g.sayHello();



    //below anonymous class can be avoided if we are using lambda expression
//     sum s = new sum() {
//         @Override
//         public int add(int num1, int num2) {
//             return num1+num2;
//         }
//     };
//     System.out.println(s.add(9,8));
 }
}
