package javaPrograms.Daily.Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args){
        int[] ar = {1,5,6,7,8,9};

        // Even numbers from array
        Arrays.stream(ar)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        List<Integer> arlist = Arrays.asList(1,2,3,4,5,6);

        // Even numbers from list
        List<Integer> even = arlist.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(even);


    }
}
