package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class removeDuplicatesPreservingOrder {
    List<Integer> arrList = new ArrayList<>(Arrays.asList(2, 3, 1, 2, 3, 4, 5, 6, 7, 8, 7, 10, 11));
    List<Integer>array = arrList.stream().distinct()
            .collect(Collectors.toList());

}
