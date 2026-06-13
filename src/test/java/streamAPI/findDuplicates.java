package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class findDuplicates {

    void printDuplicateFromArrayList() {
        List<Integer> arrList = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 3, 4, 5, 6, 7, 8, 7, 10, 11));
        Set<Integer> seen = new HashSet<>();  //seen will store elements that have already appeared.
        Set<Integer> duplicates = arrList.stream()
                .filter(n->!seen.add(n)) //Every element is first passed to seen
                .collect(Collectors.toSet());// duplicate element are passed further down the stream and collected:
        System.out.println(duplicates);
        System.out.println(seen);
    }
    public static void main(String[] args){
        findDuplicates d = new findDuplicates();
        d.printDuplicateFromArrayList();
    }
}
