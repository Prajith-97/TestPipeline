package javaPrograms.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

public class WordFrequency {
    public static void main(String[] args){
        String s = "the the basic basic apple";
        String[] ar = s.split(" ");
        Map<String, Integer> m = new HashMap<>();
        for(String a: ar){
            if(m.containsKey(a)){
                m.put(a, m.get(a)+1);
            }else {
                m.put(a, 1);
            }
        }
        for(Map.Entry<String,Integer>entry:m.entrySet()){
            System.out.println("Key"+ entry.getKey() +"Value"+entry.getValue());
        }
        Map<String, Integer> sortedMap =
                m.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        ));

        System.out.println(sortedMap);
    }
}
//We convert the map’s entrySet into a stream, sort entries based on value using comparingByValue(), and collect them into a LinkedHashMap to preserve the sorted order.
//The merge function handles duplicate keys, and the final map maintains insertion order of sorted entries.