package javaPrograms.collection;

import java.util.HashSet;
import java.util.Set;

public class iterateHashSet {
    public static void main(String[] args){
        Set<Integer>hs  = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        for (Integer s: hs){
            System.out.println(s);
        }
        if(hs.contains(3)){
            System.out.println("element present");
        }

    }
}
