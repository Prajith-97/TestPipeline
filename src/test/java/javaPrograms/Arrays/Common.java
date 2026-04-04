package javaPrograms.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Common {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        Set<Integer> set = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                common.add(num);
            }
        }

        System.out.println(common);
    }
}
