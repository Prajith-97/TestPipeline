package javaPrograms.StringFunctions;

import java.util.Scanner;

public class verifyString {
    void verifyStr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email");
        String userID = sc.nextLine();
        if (userID.length() >= 8) {
            String pattern = "^(?=.*[A-Z])(?=.*\\d).+$";
            if (userID.matches(pattern)) {
                System.out.println("User ID is valid");
            } else {
                System.out.println("User ID is invalid");
            }
        }else {
            System.out.println("User ID is invalid");
        }
    }
        public static void main (String[] args){
            verifyString v = new verifyString();
            v.verifyStr();
        }
    }
