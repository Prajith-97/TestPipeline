package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class longestString {

    void setLongestStr() {
        List<String> arrayList =
                Arrays.asList("TestABC1", "Jacob", "John", "TestABC123");

        String longestStr = arrayList.stream()
                .max(Comparator.comparing(String::length))//compares strings based on their lengths:
                .orElse("");

        System.out.println(longestStr);

    }
    void setMinimumStr(){
        List<String> arrayList =
                Arrays.asList("TestABC1", "Jacob", "John", "TestABC123");

        String mintStr = arrayList.stream()
                .min(Comparator.comparing(String::length))
                .orElse("");
        System.out.println(mintStr);
    }
    }
