package javaPrograms.Optional;

import java.util.Optional;

public class appsPerson {
    public static void main(String[] args){
        person p = new person("john");
        Optional<person> personOptional = Optional.of(p);
        System.out.println(personOptional);
    }
}
