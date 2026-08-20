package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class printDuplicatesWithCount {

    public void printDuplicates(){
        List<Integer> arrList = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 3, 4, 5, 6, 7, 8, 7, 10, 11));
        Map<Integer,Long>freqMap = arrList.stream()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()));//count how many elements are in each group.

        freqMap.entrySet().stream().filter(e ->e.getValue()>1)
                .forEach(System.out::println);

        //to find
        Optional<Integer> firstDuplicate =
                freqMap.entrySet()
                        .stream()
                        .filter(e -> e.getValue() > 1)
                        .map(Map.Entry::getKey)
                        .findFirst();

        System.out.println(firstDuplicate);
    }
    public static void main(String[] args){

    }
}
