package javaPrograms.collection;

import java.util.*;

public class removeNullValues {
    void removeNullList(){
        List<Integer> list = new ArrayList<>();
        list.add(null);
        list.add(9);
        list.add(10);
        System.out.println(list);

        list.removeIf(Objects::isNull);
        System.out.println(list);
    }
    void removeNullMap(){
        Map<String, Integer> m = new HashMap<>();
        m.put(null, 90);
        m.put("ABC", 100);
        m.put("DEF", null);
        System.out.println(m);

        m.remove(null); //to remove key with null
        m.values().removeIf(Objects::isNull);
        System.out.println(m);
    }
    public static void main(String[] args){
        removeNullValues r = new removeNullValues();
        r.removeNullList();
        r.removeNullMap();
    }
}
