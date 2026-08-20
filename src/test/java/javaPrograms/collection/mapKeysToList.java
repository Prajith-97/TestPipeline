package javaPrograms.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mapKeysToList {

    public static void main(String[] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        List<String> keyList = map.keySet()
                .stream()
                .collect(Collectors.toList());

        System.out.println(keyList);
    }
}
