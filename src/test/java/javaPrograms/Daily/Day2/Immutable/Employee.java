package javaPrograms.Daily.Day2.Immutable;

import java.util.Date;

final class Employee {

    private final int id;
    private final String name;
    private final String department;
    private final Date joiningDate;   // mutable object

    public Employee(int id, String name, String department, Date joiningDate) {
        this.id = id;
        this.name = name;
        this.department = department;

        // Defensive copy
        this.joiningDate = new Date(joiningDate.getTime());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Defensive copy in getter
    public Date getJoiningDate() {
        return new Date(joiningDate.getTime());
    }

    @Override
    public String toString() {
        return id + " " + name + " " + department + " " + joiningDate;
    }
}