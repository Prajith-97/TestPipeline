package javaPrograms.collection;

import java.util.HashMap;
import java.util.Map;

public class mergeTwoHashMap {

    void mergeLatest() {
        HashMap<String, Integer> hs1 = new HashMap<>();
        HashMap<String, Integer> hs2 = new HashMap<>();
        hs1.put("A", 10);
        hs1.put("B", 20);

        hs2.put("A", 100);
        hs2.put("B", 200);
        hs2.put("C", 300);

        hs1.putAll(hs2);
        System.out.println(hs1);
    }
        void mergeSum(){
            HashMap<String,Integer> hs3 = new HashMap<>();
            HashMap<String,Integer> hs4 = new HashMap<>();
            hs3.put("A",10 );
            hs3.put("B",20);

            hs4.put("A",100 );
            hs4.put("B",200);
            hs4.put("C", 300);

            for(Map.Entry<String,Integer> entry : hs4.entrySet()){
                hs3.merge(entry.getKey(), entry.getValue(), Integer::sum);
            }
            System.out.println(hs3);
        }




    public static void main(String[] args){
        mergeTwoHashMap m = new mergeTwoHashMap();
        m.mergeLatest();
        m.mergeSum();
    }
}
