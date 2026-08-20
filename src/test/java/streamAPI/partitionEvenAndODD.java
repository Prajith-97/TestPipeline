package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partitionEvenAndODD {

    void partitionEvenODD(){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,3,4,7,98,65,43));
        List<Integer>odd = arrayList.stream()
                .filter(n->n%2!=0)
                .collect(Collectors.toList());
        System.out.println(odd);
        List<Integer>even = arrayList.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(even);
    }

    //Another way
    void partition(){
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,3,4,7,98,65,43));
        Map<Boolean, List<Integer>> partitioned =
                arrayList.stream()
                        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partitioned);
    }

    public static void main(String[] args){
        partitionEvenAndODD p = new partitionEvenAndODD();
        p.partitionEvenODD();
    }
}
