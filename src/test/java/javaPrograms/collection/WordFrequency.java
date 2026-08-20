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

//1. Get all entries from the map
//m.entrySet()
//
//Converts the map into a set of key-value pairs:
//
//        [A=30, B=10, C=20]
//        2. Convert to Stream
//        .stream()
//
//Creates a stream of entries so we can perform operations like sorting.
//
//Stream<Entry<String, Integer>>
//3. Sort by Value
//        .sorted(Map.Entry.comparingByValue())
//
//Sorts entries in ascending order based on their values.
//
//Before sorting:
//
//A=30
//B=10
//C=20
//
//After sorting:
//
//B=10
//C=20
//A=30
//        4. Collect back into a Map
//        .collect(Collectors.toMap(
//
//        Converts the sorted stream back into a map.
//
//        First Argument
//        Map.Entry::getKey
//
//        Extracts the key.
//
//        Equivalent to:
//
//        entry -> entry.getKey()
//
//Example:
//
//B=10 → B
//        C=20 → C
//        A=30 → A
//Second Argument
//Map.Entry::getValue
//
//Extracts the value.
//
//Equivalent to:
//
//entry -> entry.getValue()
//
//Example:
//
//B=10 → 10
//C=20 → 20
//A=30 → 30
//Third Argument (Merge Function)
//(e1, e2) -> e1
//
//Used when duplicate keys occur.
//
//If two entries have the same key:
//
//key -> value1
//key -> value2
//
//Keep the first value:
//
//        (e1, e2) -> e1
//
//Example:
//
//        ("A", 10)
//        ("A", 20)
//
//Result:
//
//A = 10
//
//For a normal map this function is rarely used because keys are already unique, but toMap() requires it.
//
//Fourth Argument (Map Supplier)
//LinkedHashMap::new
//
//Creates a LinkedHashMap.
//
//        Why?
//
//HashMap does not maintain insertion order.
//LinkedHashMap maintains insertion order.
//
//Since entries are already sorted, we want to preserve that order.
//
//Result:
//
//        {B=10, C=20, A=30}