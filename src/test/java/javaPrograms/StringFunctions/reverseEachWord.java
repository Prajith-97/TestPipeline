package javaPrograms.StringFunctions;

public class reverseEachWord {

    public static void main(String[] args){
        String str = "hello word !";
        String reverseStr = "";
        String[] words=str.split(" ");
        for(int i=0;i<words.length;i++){
            String word = words[i];
            String newStr="";
            for(int j=word.length()-1;j>=0;j--){
                char c=word.charAt(j);
                newStr=newStr+c;

            }
            reverseStr=reverseStr + newStr+" ";
        }
        System.out.println(reverseStr);
    }
}
