package javaPrograms.Arrays;

import java.util.Arrays;

public class basic {
    public static void main(String[] args){
        int[] nums = {1,2,-3,4,5};
        int [] num1 = {1,2,-3,4,5};
        String[] names = {"ben", "adam", "john", "jack" };
        Arrays.sort(nums); //sorting. quick sort is the algorithm behind as we are using primitive data type
        Arrays.sort(names);//merged sort is the algorithm as string is objects
        Arrays.sort(num1);

        //binary search
        int result = Arrays.binarySearch(nums, -3);
        String res = String.valueOf(Arrays.binarySearch(names,"adam"));
        System.out.println(res);
        System.out.println(result);

        //compare. returns zero if arrays are equal
        System.out.println(Arrays.compare(nums,num1));

        //equals, returns true if both are equal
        System.out.println(Arrays.equals(nums,num1));

        //copy one dimensional
        int[] arNum = Arrays.copyOf(nums, nums.length);

        System.out.println(Arrays.toString(arNum));
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(names));

        Arrays.fill(nums,21); //change all values in array to 21
    }
}
