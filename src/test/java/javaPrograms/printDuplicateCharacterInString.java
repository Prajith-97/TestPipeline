package javaPrograms;

public class printDuplicateCharacterInString {

    public static void main (String[] args){
        String str = "hackerearth";
        char strChar[] = str.toCharArray();

        for (int i=0;i<str.length();i++){
            boolean isBoolean = false;
            for(int j=i+1;j<str.length();j++){
                if(strChar[i] == strChar[j]){
                    isBoolean = true;
                    break;
                }
            }
            if(isBoolean){
                System.out.println(strChar[i]);
            }
        }
    }
}
