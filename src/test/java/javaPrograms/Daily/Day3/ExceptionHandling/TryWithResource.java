package javaPrograms.Daily.Day3.ExceptionHandling;

import java.io.*;

public class TryWithResource {

    public  static String filePath = "C://Users//PRAJITH//OneDrive//Learning//FrameworkTestNG//src//testData";
    public static void main(String[] args){
        try (BufferedReader file = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = file.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

//BufferedReader implements AutoCloseable → eligible for try-with-resources.
