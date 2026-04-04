package javaPrograms.StringFunctions;

public class countWords {
            public static void main(String[] args) {

        String s = "Welcome to Java programming world";

        // trim() removes leading/trailing spaces
        String[] words = s.trim().split("\\s+");

        System.out.println("Word Count: " + words.length);
        for(String w: words){
            System.out.println(w);
        }
    }
}
