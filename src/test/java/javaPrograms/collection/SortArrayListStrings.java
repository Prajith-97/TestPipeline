package javaPrograms.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListStrings {
    void sortArrayListString(){
        ArrayList<String>arrayList = new ArrayList<>();
        arrayList.add("john");
        arrayList.add("mike");
        arrayList.add("alen");
        arrayList.add("albin");
        System.out.println(arrayList.contains("ben"));
        Collections.sort(arrayList);
        System.out.println(arrayList);
        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList);

    }
    public static void main(String[] args){
        SortArrayListStrings sort = new SortArrayListStrings();
        sort.sortArrayListString();
    }
}
