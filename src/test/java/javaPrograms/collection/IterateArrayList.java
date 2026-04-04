package javaPrograms.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IterateArrayList {
    public static void main(String[] args){
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
//        arrList.add(null);

        for(Integer arr:arrList){
            System.out.println(arr);
        }
        for(int ar:arrList){
            System.out.println(ar);
        }
        if(arrList.contains(3)){
            System.out.println("Element present");
        }
        // Convert List to Array (Integer[])
        Integer[] array = new Integer[arrList.size()];
        arrList.toArray(array);  // Proper usage
        System.out.println("Array length: " + array.length);

        // Convert array to modifiable list
        List<Integer> list = new ArrayList<>(List.of(array));
        list.add(9); // Works fine
        System.out.println("Modified List: " + list);

        // Convert List<Integer> to int[]
        int[] ar = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            ar[i] = arrList.get(i);
        }

        // Convert int[] back to List<Integer>
//        List<Integer> ArList = Arrays.stream(ar).boxed().collect(Collectors.toList());
        List<Integer> ArList = Arrays.stream(ar).boxed().toList();
        System.out.println("Converted List from int[]: " + ArList);
    }
}



