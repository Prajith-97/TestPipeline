package javaPrograms.OOP.Encapsulation;

public class parent {
    private String name;
    private String age;

    public parent(){
        System.out.println(name);
        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//-------------------------------------------------
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }





}
