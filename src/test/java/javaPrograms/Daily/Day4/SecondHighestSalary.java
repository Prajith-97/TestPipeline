import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {

    public static void main(String[] args) {

        List<Integer> salaries = Arrays.asList(30000, 50000, 70000, 40000, 70000);

        int secondHighest = salaries.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondHighest);
    }
}
//First I convert the list into a stream. Then I remove duplicates using distinct().
//After that I sort the elements in descending order using sorted(Comparator.reverseOrder()).
//Then I skip the first element (highest salary) using skip(1) and fetch the next element using findFirst().