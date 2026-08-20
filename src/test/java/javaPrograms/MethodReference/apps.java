package javaPrograms.MethodReference;

import java.util.Arrays;

public class apps {
    public static void main(String[] args) {
        //1) static
        FunInterface funInterface = apps::staticGreeting;
        funInterface.show();

        //2) instance greeting
        apps a = new apps();
        FunInterface funInterface1 = a::instanceGreeting;
        funInterface1.show();

        //3)
        String[] names = {"john", "jack", "sam","Alan","Alex"};
        Arrays.sort(names,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));

        //4)
        FunMsgInterface funMsgInterface = message::new;
        funMsgInterface.showMessage("Codeee Javaaa");

    }
        public static void staticGreeting() {
            System.out.println("Static Method");
        }

        public void instanceGreeting(){
           System.out.println("Instance Greeting");
        }
    }

