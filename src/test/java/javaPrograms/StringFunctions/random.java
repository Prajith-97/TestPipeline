package javaPrograms.StringFunctions;

import java.util.Random;

public class random {
   String randomStringGenerator(int length){
        Random r = new Random();
        StringBuilder sb = new StringBuilder(length);
        final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for(int i=0;i<length;i++){
            int index = r.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
       random ran = new random();
       System.out.println(ran.randomStringGenerator(8));
    }
}
