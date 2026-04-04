package javaPrograms.Arrays;

import java.util.*;

public class arrayBasicOperations {
    int min;
    int max;
    void arrayList(){

        List<Integer> arList = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            int num = random.nextInt(100);
            arList.add(num);
        }

        //sort
        Collections.sort(arList);
        System.out.println(arList);

        //maximum and minimum
        min = arList.getFirst();
        max = arList.getFirst();

//        int min = Collections.min(arLIst);
//        int max = Collections.max(arList);

        for(int i=1;i<arList.size();i++){
            int n = arList.get(i);
            if(max<n){
                max=n;
            }
            if(min>n){
                min=n;
            }
        }
        System.out.println(max);
        System.out.println(min);

        //remove even numbers
        for(int i=arList.size()-1;i>=0;i--){
            int num = arList.get(i);
            if(num%2==0){
                arList.remove(i);
            }
        }
        System.out.println(arList);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        if(arList.contains(number)){
            System.out.println("Element Present");
        }else {
            System.out.println("Not found");
        }
        arList.clear();
        System.out.println(arList.size());

    }

    public static void main (String[] args){
        arrayBasicOperations ar = new arrayBasicOperations();
        ar.arrayList();
    }
}
