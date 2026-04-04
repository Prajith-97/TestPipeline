package javaPrograms.StringFunctions;

public class reverseString {
    public static void main (String[] args){
        String str = "my string is String";
        StringBuilder outputString = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            outputString.append(str.charAt(i));
        }
        System.out.println(outputString);
    }
}
