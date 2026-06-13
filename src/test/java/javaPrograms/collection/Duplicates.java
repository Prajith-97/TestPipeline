package javaPrograms.collection;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args){
        int[] ar ={1,2,1,2,3,4,5,6};
        Set<Integer> s= new HashSet<>();
        Set<Integer> d= new HashSet<>();
        for(Integer a: ar){
            if(s.contains(a)){
                d.add(a);
            }else {
                s.add(a);
            }
        }
        System.out.println(s);
        System.out.println(d);
        List<Integer> list =
                Arrays.stream(ar)        // IntStream
                        .boxed()           // int → Integer
                        .collect(Collectors.toCollection(ArrayList::new)); //converting array to array list
        System.out.println(list);
        Set<Integer>su = new HashSet<>(list);
        System.out.println(su);
    }

}
