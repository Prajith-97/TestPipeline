package javaPrograms.Arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public int[] remove(int[] arr) {

        // Use LinkedHashSet to maintain insertion order
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        // Convert Set back to int[]
        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index] = num;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {

        RemoveDuplicates obj = new RemoveDuplicates();
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        int[] result = obj.remove(arr);

        System.out.println(Arrays.toString(result));
    }
}
