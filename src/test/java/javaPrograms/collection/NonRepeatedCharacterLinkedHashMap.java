package javaPrograms.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharacterLinkedHashMap {

    void unique(){
        String s = "uyyytriuuuuuu";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i=0;i<s.length()-1;i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }
    }
    public static void main(String[] args){
        NonRepeatedCharacterLinkedHashMap linkedHashMap = new NonRepeatedCharacterLinkedHashMap();
        linkedHashMap.unique();
    }
}
