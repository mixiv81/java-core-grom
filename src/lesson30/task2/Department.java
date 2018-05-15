package lesson30.task2;

import java.util.Collection;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Department{" +
                "type=" + type +
                ", employees=" + employees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return type == that.type &&
                Objects.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, employees);
    }
}
