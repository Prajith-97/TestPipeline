package javaPrograms.Serialization;

import java.io.Serial;
import java.io.Serializable;

public class car implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    String carBrand;
    int motorNumber;
    String color;
    transient String model; // transient: won't be serialized

    public car(String carBrand, int motorNumber, String color,String model){
        this.carBrand=carBrand;
        this.motorNumber = motorNumber;
        this.color = color;
        this.model = model;
    }
   public String toString(){
        return this.carBrand+"-"+this.motorNumber+"-"+this.color;
   }
}
