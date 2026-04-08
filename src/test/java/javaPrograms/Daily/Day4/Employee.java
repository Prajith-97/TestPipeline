package javaPrograms.Daily.Day4;


import javaPrograms.Daily.Day1.EmployeeDetails.CustomException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {

    int salary;
    String name;
    String department;
    int id;

    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
    public static void main(String[] args) throws CustomException {

        List<Employee> employees = Arrays.asList(
                new Employee(9, "John", "IT", 50000),
                new Employee(1, "David", "HR", 40000),
                new Employee(3, "Smith", "IT", 60000),
                new Employee(6, "Mary", "Finance", 55000),
                new Employee(2, "Chris", "HR", 45000),
                new Employee(5, "Chris", "HR", 45000)
        );
        //by default below will sort employees in ascending order based on salary
        //As we are using getters we can modify the below function
        List<Employee> sortEmpSalaryAsc = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(sortEmpSalaryAsc);
//                        .forEach(System.out::println);

//        employees.stream()
//                .sorted(Comparator.comparing((Employee emp) -> emp.salary))
//                        .forEach(System.out::println);

        //descending order based
        List<Employee> sortEmpSalaryDsc = employees.stream()
                .sorted(Comparator.comparing((Employee emp) -> emp.salary).reversed())
//                .forEach(System.out::println);
                .collect(Collectors.toList());
        System.out.println(sortEmpSalaryDsc);


        //multilevel sorting
        List<Employee> sortEmployeeNameID = employees.stream()
                .sorted(Comparator.comparing((Employee emp) -> emp.id)
                        .thenComparing(emp -> emp.name))
                .collect(Collectors.toList());
        System.out.println(sortEmployeeNameID);
//                .forEach(System.out::println);

        System.out.println(employees);
//        Streams do not mutate the source collection.
//                They produce a new result, which must be consumed using a terminal operation.


        List<Employee> sortEmployeeMoreThan50000 = employees.stream()
                .filter((Employee e)->e.salary>50000)
                .collect(Collectors.toList());
                 System.out.println(sortEmployeeMoreThan50000);
        System.out.println("Test");
        System.out.println("Test1");
    }
}

//🔴 Why toString() is required?
//When you do:
//        System.out.println(emp);
//Java automatically calls:
//        emp.toString();
//❌ What happens WITHOUT overriding?
//Default implementation from Object class runs:
//Employee@5a07e868
//👉 This is:
//Class name (Employee)
//Memory address (hashcode)

//✔ Useful for JVM
//❌ Useless for humans

//✅ What happens AFTER overriding?
//@Override
//public String toString() {
//    return id + " " + name + " " + department + " " + salary;
//}

//Now:
//        System.out.println(emp);
//👉 Output:
//        1 David HR 40000
//        ✔ Human-readable
//✔ Debug-friendly