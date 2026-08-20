package javaPrograms.StringFunctions;

import javax.xml.stream.events.Characters;
import java.util.HashMap;
import java.util.Map;

public class countCharacters {

    public static void main(String[] args){
        String s = "abcdefggghhh";
        Map<Character, Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (m.containsKey(c)){
                m.put(c,m.get(c)+1);
                }else{
                    m.put(c,1);
                }
            }
        System.out.println(m);
    }
}
