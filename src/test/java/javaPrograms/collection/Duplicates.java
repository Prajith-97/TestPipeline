package javaPrograms.collection;

import java.util.HashSet;
import java.util.Set;

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
        System.out.println(d);
    }
}
