package javaPrograms.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFromArrayList {

    void removeDuplicate() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(1);

        HashSet<Integer> hs = new HashSet<>(arrayList);
        System.out.println(hs);

    }
    public static void main(String[] args){
       RemoveDuplicateFromArrayList remove = new RemoveDuplicateFromArrayList();
       remove.removeDuplicate();
    }
}
