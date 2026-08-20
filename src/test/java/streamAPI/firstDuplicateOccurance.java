package streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class firstDuplicateOccurance {

    void printFirstDuplicate() {

    int[] arr = {1, 2, 3, 2, 4, 5, 3, 6, 1};

    Set<Integer> seen = new HashSet<>();
    Optional<Integer> firstDuplicate = Arrays.stream(arr) //findFirst() returns only one element, and that element may or may not exist
            .filter(n -> !seen.add(n))
            .boxed()
            .findFirst();
    System.out.println(firstDuplicate);
    }
    public static void main(String[] args){
     firstDuplicateOccurance first = new firstDuplicateOccurance();
     first.printFirstDuplicate();
    }
}
