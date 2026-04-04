package javaPrograms.Optional;

public class person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public person(String name){
        this.name = name;
        System.out.println("c");
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
