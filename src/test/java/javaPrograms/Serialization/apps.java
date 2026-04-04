package javaPrograms.Serialization;

import java.io.*;

public class apps {
    public static void main(String[] args){
        car c = new car("Ford", 9988,"blue","V5");
        try{
            FileOutputStream fileOutput = new FileOutputStream("serialization.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
            outputStream.writeObject(c);
            System.out.println(c);
            outputStream.close();
            fileOutput.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //DeSerialization
        try{
            System.out.println(c.color);
            System.out.println(c.model);
            FileInputStream fileInput = new FileInputStream("serialization.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileInput);
            car deserialization = (car) inputStream.readObject();
            inputStream.close();
            fileInput.close();
            System.out.println(deserialization);
            System.out.println(deserialization.model);
        }catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
