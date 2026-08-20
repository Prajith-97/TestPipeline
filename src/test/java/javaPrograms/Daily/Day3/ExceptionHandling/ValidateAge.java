package javaPrograms.Daily.Day3.ExceptionHandling;

public class ValidateAge {

    void age(int age){
       if(age<=0) {
           throw new IllegalArgumentException("Age should be greater than zero");
       }else{
           System.out.println(age);
       }
    }
    public static void main(String[] args){
        try{
            ValidateAge a = new ValidateAge();
            a.age(0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
