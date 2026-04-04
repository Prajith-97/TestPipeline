package javaPrograms.Arrays;

public class sort {
    public static void main(String[] args){
        int[] ar={1,9,7,2,4,5};
        int temp=0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length-1;j++){
                if(ar[j]>ar[j+1]){
                    temp = ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for(int n : ar){
            System.out.println(n);
        }

    }
}
