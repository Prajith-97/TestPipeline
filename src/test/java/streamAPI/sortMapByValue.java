package streamAPI;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class sortMapByValue {
    void sortMapAscending(){
        Map<String,Integer> map = new HashMap<>();
        map.put("john",3);
        map.put("jacob",9);
        map.put("jinto",14);
        map.put("rahul",50);
        map.put("rahul",12);
        Map<String,Integer> sort = map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<String,Integer>::getValue))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,   //key mapper
                        Map.Entry::getValue, //Value mapper
                        (e1,e2)->e1,         //Merge function (used if duplicate keys occur)
                        LinkedHashMap::new   //Preserve sorted order
                ));
        System.out.println(sort);
    }

    void sortMapDescending() {
        Map<String, Integer> map = new HashMap<>();
        map.put("john", 3);
        map.put("jacob", 9);
        map.put("jinto", 14);
        map.put("rahul", 50);
        map.put("rahul", 12);

        Map<String,Integer>sort = map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<String,Integer>::getValue).reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println(sort);

    }
    public static void main(String[] args){
        sortMapByValue s = new sortMapByValue();
        s.sortMapAscending();
        s.sortMapDescending();
    }
}
