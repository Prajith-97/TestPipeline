package javaPrograms.collection;

import java.util.ArrayList;
import java.util.Collection;

public class commonElementsArrayList {

    void common(){
        ArrayList<Integer> arrList1 = new ArrayList<>();

        arrList1.add(9);
        arrList1.add(10);
        arrList1.add(9);

        ArrayList<Integer> arrList2 = new ArrayList<>();
        arrList2.add(10);
        arrList2.add(10);
        arrList2.add(9);
        arrList2.add(1);
        arrList2.add(2);
        arrList2.add(3);

        ArrayList<Integer>com = new ArrayList<>();
        ArrayList<Integer>unique = new ArrayList<>();
        for (Integer a : arrList2) {
            if (arrList1.contains(a)) {
                if (!com.contains(a)) {
                    com.add(a); // add to common only once
                }
            } else {
                if (!unique.contains(a)) {
                    unique.add(a); // add to unique only once
                }
            }
        }
        System.out.println(com);
        System.out.println(unique);
    }
    public static void main(String[] args){
        commonElementsArrayList c = new commonElementsArrayList();
        c.common();
    }
}
