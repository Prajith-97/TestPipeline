package javaPrograms.StringFunctions;

import java.util.Scanner;

public class reverse {

    void reverseString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        StringBuilder strBuilder = new StringBuilder();
        for(int i = name.length()-1; i >= 0; i--){
           strBuilder.append(name.charAt(i));
        }
         System.out.println(strBuilder.toString());
    }
    public static void main(String[] args){
        reverse r = new reverse();
        r.reverseString();
    }
}
