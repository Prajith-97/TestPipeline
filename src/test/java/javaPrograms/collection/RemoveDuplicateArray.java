package javaPrograms.collection;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class RemoveDuplicateArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 3, 5};


        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println(set);
        int[] result = new int[set.size()];
        int i = 0;

        for (int num : set) {
            result[i++] = num;
        }
    }
}
