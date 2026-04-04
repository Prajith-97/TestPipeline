package javaPrograms.Daily.Day1.EmployeeDetails;

public class Employee {
    private int id;
    private int age;
    private double salary;
    private String emailID;

   public Employee(int id, int age, int salary, String emailID) throws CustomException {
       setId(id);
       setAge(age);
       setSalary(salary);
       setEmail(emailID);
//In below code we are doing the validation inside the constructor itself
//       this.id = id;
//       this.age = age;
//       this.salary = salary;
//       this.emailID = emailID;
//
//       if (id < 0) {
//           throw new CustomException("ID should be greater than zero");
//       }
//       if (age < 18 || age > 60) {
//           throw new CustomException("Age should be between 18 and 60");
//       }
//       if (salary <= 0) {
//           throw new CustomException("Salary must be greater than 0");
//       }
//       if (!emailID.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
//           throw new CustomException("Invalid email format");
//       }
   }

    public void setId(int id) throws CustomException {
        if (id <= 0)
            throw new CustomException("Id must be greater than 0");
        this.id = id;
    }

    public void setAge(int age) throws CustomException {
        if (age < 18 || age > 60)
            throw new CustomException("Age must be between 18 and 60");
        this.age = age;
    }

    public void setSalary(double salary) throws CustomException {
        if (salary <= 0)
            throw new CustomException("Salary must be greater than 0");
        this.salary = salary;
    }

    public void setEmail(String emailID) throws CustomException {
        if (!emailID.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            throw new CustomException("Invalid email format");
        this.emailID = emailID;
    }
   void display(){
       System.out.println(id + "  " +age+ "  "+salary +" " +emailID);
   }
}

//Q1: Why variables private?
//To achieve encapsulation and data security.

//Q2: Why throw exception in constructor?
//Prevent object creation with invalid state.

//Q3: Checked vs Unchecked — which better?
//For validation failures, unchecked (RuntimeException) is commonly used in real projects.

//Q4: Can we move validation to setters?
//Yes — better design for mutable objects.

//Q5: What happens if exception thrown in constructor?
//Object creation fails — no object created.

