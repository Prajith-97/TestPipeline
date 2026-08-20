package javaPrograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeArrays {



        public static int[] merge(int[] arr1, int[] arr2) {

            int[] result = new int[arr1.length + arr2.length];

            int index = 0;

            for (int num : arr1) {
                result[index++] = num;
            }

            for (int num : arr2) {
                result[index++] = num;
            }

            return result;
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5, 6};

            int[] merged = merge(arr1, arr2);

            System.out.println(Arrays.toString(merged));
        }

}
