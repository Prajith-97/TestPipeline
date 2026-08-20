package javaPrograms.StringFunctions;

public class vowels {
    public static void main(String[] args) {

        String str = "Hello World AABB CC";

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();   // convert to lowercase

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z') {   // check alphabet

                if (c == 'a' || c == 'e' || c == 'i' ||
                        c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
