package javaPrograms;

import java.util.LinkedHashSet;

public class removeDuplicateCharacterFromString {
    public static void main (String[] args) {
        String str = "hackerearth";
        //convert string to lowercase
        //convert string to char array
        //declare a linked hashset with char variable
        //iterate through lowercase char array and if element not present add into linkedSet
        //declare string builder
        //iterate through unique char array and append value to new string builder variable


        String lowerStr = str.toLowerCase();
        char[] lowerCharArr = lowerStr.toCharArray();
        LinkedHashSet<Character>uniqueChar = new LinkedHashSet<>();
        for(char ch:lowerCharArr){
            if(!uniqueChar.contains(ch)){
                uniqueChar.add(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for(char c:uniqueChar){
            result.append(c);
        }
        System.out.println(result);

    }

}




