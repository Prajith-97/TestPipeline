package javaPrograms.StringFunctions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class checkEmailId {
    void verifyEmailID(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email");
        String email = sc.nextLine();
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
    }
    public static void main(String[] args){
        checkEmailId verifyEmail = new checkEmailId();
        verifyEmail.verifyEmailID();
    }
}
