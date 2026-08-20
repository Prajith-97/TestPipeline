package javaPrograms.StringFunctions;

public class palindrome {
    public static void main(String[] args){
        String s = "malayalam1";
        StringBuilder newString = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char c= s.charAt(i);
            newString.append(c);
        }
        if(s.equalsIgnoreCase(newString.toString())){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
