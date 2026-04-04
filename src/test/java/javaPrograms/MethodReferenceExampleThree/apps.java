package javaPrograms.MethodReferenceExampleThree;

import java.util.*;

public class apps {
    public static void main(String[] args){

        List<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Alvin");
        names.add("Ben");
        names.forEach(name ->System.out.println(name));
        names.forEach(System.out::println);  //method reference

        Set<String> set = new HashSet<>();
        set.add("item 1");
        set.add("item 2");
        set.add("item 3");
        set.forEach(System.out::println);

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        for (Map.Entry<String,Integer> entry :map.entrySet())
            System.out.println(entry.getKey() + "-"+ entry.getValue());

        map.forEach((key,value) -> System.out.println(key+" - "+value));
    }
}
