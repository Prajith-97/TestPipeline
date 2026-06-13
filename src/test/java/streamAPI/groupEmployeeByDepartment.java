package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class groupEmployeeByDepartment {
    void groupEmployee(){
        Map<String,String> employees=new HashMap<>();
        employees.put("Jack","Physicis");
        employees.put("Rahul","Mechanical");
        employees.put("Jhon","Electrical");
        employees.put("Jack","Computer");

        Map<String, List<String>> grouped = employees.entrySet().stream().
                                    collect(Collectors.groupingBy(
                                            Map.Entry::getValue,
                                            Collectors.mapping(
                                                    Map.Entry::getKey,
                                                    Collectors.toList()
                                            )
                                    ));

        System.out.println(grouped);

    }
}
