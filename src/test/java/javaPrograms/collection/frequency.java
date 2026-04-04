package javaPrograms.collection;

import java.util.HashMap;
import java.util.Map;

public class frequency {

    public static void main(String[] args){
          frequency f = new frequency();
          f.countCharacter();
    }
    void countCharacter(){
        Map<Character, Integer>  map = new HashMap<>();
        String str = "pppooiiibyypy";
        for(int i = 0;i<str.length();i++){
            Character c = str.charAt(i);
            if(map.containsKey(c)){
              map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer>entry: map.entrySet()){
            System.out.println("Key "+entry.getKey()+ "value "+entry.getValue());
        }
    }
}
