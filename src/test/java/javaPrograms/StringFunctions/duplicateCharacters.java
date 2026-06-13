package javaPrograms.StringFunctions;

import java.util.HashMap;
import java.util.Set;

public class duplicateCharacters {
    public static void main(String[] args){
        String str = "Hello World AABB CC";
        HashMap<Character, Integer> m = new HashMap<>();
        int length=str.length();
        for(int i=0;i<length-1;i++){
            char c=str.charAt(i);
            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }else{
                m.put(c,1);
            }
        }
        for (Character c: m.keySet()){
            System.out.println(c+" "+m.get(c));
        }
        Set<Character>ch=m.keySet();
        for(Character cha:ch){
         if(m.get(cha)>1) {
             System.out.println(cha +":"+m.get(cha));
         }
        }
        String s = "programming";
        StringBuilder result = new StringBuilder();

        for (char ch1 : s.toCharArray()) {
            if (result.indexOf(String.valueOf(ch1)) == -1) {
                result.append(ch1);
            }
        }

        System.out.println(result);
    }
}
