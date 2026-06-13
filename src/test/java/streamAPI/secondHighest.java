package streamAPI;

import java.util.*;

public class secondHighest {

    void secondHighestFromArrayList(){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(3,4,9,100,8,4,56,2));
        Optional<Integer> secondHighest = arrayList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(secondHighest);
    }

    public static void main(String[] args){
        secondHighest s = new secondHighest();
        s.secondHighestFromArrayList();
    }
}
