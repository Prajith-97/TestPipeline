package javaPrograms.Daily.Day4;

import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args){
        List<Integer> arlist = Arrays.asList(1,2,3,4,5,6);
        int s=arlist.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(s);
    }
}
