package javaPrograms.Arrays;

public class secondMaximum {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 7};

        int max = arr[0];
        for (int n : arr) {
            if (n > max)
                max = n;
        }

        int secondMax = Integer.MIN_VALUE;  //stores minimum possible value for the integer
        for (int n : arr) {
            if (n != max && n > secondMax)
                secondMax = n;
        }

        System.out.println("Second max: " + secondMax);
    }
}