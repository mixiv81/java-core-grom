package lesson30.task2;

import java.util.Collection;

public class Department {
    private DepartmentType type;
    private Collection employees;

    public Department(DepartmentType type) {
        this.type = type;
    }

    public DepartmentType getType() {
        return type;
    }

    public Collection getEmployees() {
        return employees;
    }
}
