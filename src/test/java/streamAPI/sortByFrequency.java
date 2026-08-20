package streamAPI;

import java.util.*;

public class sortByFrequency {

    void sort(){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,1,2,3,4,5,6,10,9,11));
        Map<Integer,Integer> hashMapNumbers = new HashMap<>();
        for(Integer n:numbers){
            if(hashMapNumbers.containsKey(n)){
                hashMapNumbers.put(n,hashMapNumbers.get(n)+1);
            }else {
                hashMapNumbers.put(n,1);
            }
        }
        List<Integer>sortedOutput = hashMapNumbers.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<Integer,Integer>::getValue)
                        .thenComparing(Map.Entry::getKey))
                .flatMap(e -> Collections.nCopies(e.getValue(), e.getKey()).stream())
                .toList();
        System.out.println(sortedOutput);

    }
    public static void main(String[] args){
        sortByFrequency s = new sortByFrequency();
        s.sort();
    }
}

//Entry: 3=2
//        [3, 3]
//converted to stream:
//        3, 3
//Entry: 1=3
//        [1, 1, 1]
//converted to stream:
//        1, 1, 1
//flatMap() merges all these streams into one:


//e is just a variable name representing each Map.Entry<Integer, Integer> in the stream.
//
//For example, if your map is:
//Map<Integer, Integer> map = new HashMap<>();
//map.put(5, 1);
//map.put(3, 2);
//map.put(1, 3);

//Then:
//        map.entrySet().stream()
//produces entries like:
//        5=1
//        3=2
//        1=3


//One by one, each entry is assigned to e.
//Iteration 1
//e = 5=1


//So:
//        e.getKey()    // 5
//e.getValue()  // 1
//
//This becomes:
//        Collections.nCopies(1, 5)

//Result:
//
//        [5]
//Iteration 2
//e = 3=2
//
//So:
//
//        e.getKey()    // 3
//e.getValue()  // 2
//
//This becomes:
//
//        Collections.nCopies(2, 3)
//
//Result:
//
//        [3, 3]
//Iteration 3

//e = 1=3
//So:
//
//        Collections.nCopies(3, 1)
//
//Result:
//
//        [1, 1, 1]
//Same code with a more meaningful variable name
//
//Instead of e, you can write:
//
//        .flatMap(entry ->
//        Collections.nCopies(entry.getValue(), entry.getKey()).stream()
//)

//Here:
//        entry.getKey() → the number
//entry.getValue() → its frequency

//Many Java developers use:
//e for entry
//n for number
//s for string
//x for a generic element

//So these are equivalent:
//
//        .flatMap(e -> Collections.nCopies(e.getValue(), e.getKey()).stream())
//        .flatMap(entry -> Collections.nCopies(entry.getValue(), entry.getKey()).stream())