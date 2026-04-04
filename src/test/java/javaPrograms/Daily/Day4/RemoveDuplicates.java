package javaPrograms.Daily.Day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,2,4,5,3,6);

        List<Integer> result = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
