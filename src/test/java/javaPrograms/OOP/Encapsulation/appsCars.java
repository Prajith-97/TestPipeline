package javaPrograms.OOP.Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class appsCars {
    public static void main(String[] args){
        List<String> car= new ArrayList<>();
        car.add("Honda");
        car.add("Suzuki");
        car.add("Toyota");
        cars C = new cars();
        C.setCar(car);

        for (String s: C.getCar()){
            System.out.println(s);
        }
        car.add("BMW");
        for (String s: C.getCar()){
            System.out.println(s);
        }
    }
}
