package javaPrograms.OOP.Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class cars {

    private List<String> car;

    public List<String> getCar() {
        return new ArrayList<>(this.car);
    }

    public void setCar(List<String> car) {
        this.car = car;
    }

}
