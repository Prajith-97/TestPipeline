package javaPrograms.comparisonOperator;

public class App {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        if(cat instanceof Animal){
            System.out.println("cat is animal...");
        }else {
            System.out.println("cat is not animal...");
        }
        if(dog instanceof Mammal){
            System.out.println("dog is mammal...");
        }else {
            System.out.println("dog is not mammal...");
        }
    }
}
