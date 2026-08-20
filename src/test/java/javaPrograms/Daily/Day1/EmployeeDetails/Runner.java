package javaPrograms.Daily.Day1.EmployeeDetails;

public class Runner {
    public static void main(String[] args){
      try{
          Employee emp = new Employee(1,57, 300, "tprajith@gmail.com");
          emp.display();
      }catch (CustomException e){
          System.out.println(e.getMessage());
      }


    }
}
