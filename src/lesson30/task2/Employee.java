package lesson30.task2;

import java.util.Collection;
import java.util.Date;

public class Employee {
    private String firstName;
    private String lastName;
    private Date dateHired;
    private Position position;
    private Department department;
    private Collection projects;

    public Employee(String firstName, String lastName, Date dateHired, Position position, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateHired = dateHired;
        this.position = position;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public Position getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }

    public Collection getProjects() {
        return projects;
    }
}
