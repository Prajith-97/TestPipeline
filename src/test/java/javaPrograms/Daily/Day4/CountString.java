package javaPrograms.Daily.Day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountString {
    public static void main(String[] args){
        List<String> arList = Arrays.asList("Apple", "Banana", "Avocado","Mango");
        arList.sort((a,b)->a.length()-b.length());
        System.out.println(arList);
       List<String>ar= arList.stream().filter(s->s.charAt(0)=='A')
                .toList();
       System.out.println(ar);
        long count = arList.stream()
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println(count);
    }
}
