package javaPrograms.collection;

import java.util.ArrayList;
import java.util.List;

public class MaximumAndMinimum {
    void maxAndMin(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(4);
        list.add(3);

        int max=0;
        int min=0;

        for(Integer n:list){
            if(n>max){
                min=max;
                max=n;
            }
        }
        System.out.println(max);
        System.out.println(min);
//        for(int i=0;i<list.size()-1;i++){
//            if(max<list.get(i)){
//                min = max;
//                max = list.get(i);
//
//            }
//
//        }
//        System.out.println(max);
//        System.out.println(min);
    }
    public static void main(String[] args){
        MaximumAndMinimum m = new MaximumAndMinimum();
        m.maxAndMin();
    }
}
