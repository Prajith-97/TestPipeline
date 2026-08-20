package javaPrograms.Number;

import java.util.ArrayList;

public class primeNumber {
    public static void main(String[] args){
        int num=100;
        ArrayList<Integer>ar = new ArrayList<>();
        for (int i=2;i<num;i++){
            boolean isPrime = true;
            for (int j=2;j<i/2;j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                ar.add(i);
            }
        }
        System.out.println(ar);
    }
}
