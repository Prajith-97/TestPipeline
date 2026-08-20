package javaPrograms.Daily.Day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CovertUpperCase {
    public static void main(String[] args) {
        List<String> arList = Arrays.asList("Apple", "Banana", "Avocado", "Mango");
    List<String>upper = arList.stream()
            .map(s -> s.toUpperCase())
            .collect(Collectors.toList());
    System.out.println(upper);
        System.out.println(upper);
    }
}
//map() is used to transform elements.