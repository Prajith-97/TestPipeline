package javaPrograms.collection;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args){
      map m = new map();
      m.testMap();
    }
    void testMap(){
        Map<Integer,String> m = new HashMap<>();
        m.put(1,"first");
        m.put(2,"second");
        m.put(3,"third");
        for(Map.Entry<Integer,String>entry: m.entrySet()){
            System.out.println("Key " +entry.getKey()+ "value "+ entry.getValue());
        }


        for(Integer k: m.keySet()){
            System.out.println(m.get(k));
            System.out.println(k);

        }

        m.forEach((key, value) -> {
            System.out.println("Key = " + key + ", Value = " + value);
        });
    }
}
