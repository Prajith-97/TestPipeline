package javaPrograms.Arrays;

public class MaxMin {

    public static void main(String[] args) {

        int[] ar = {2, 3, 4, 1, 4, 7, 8, 9};

        int max = ar[0];
        int min = ar[0];

        for (int i = 1; i < ar.length; i++) {

            if (ar[i] > max) {
                max = ar[i];
            }

            if (ar[i] < min) {
                min = ar[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
