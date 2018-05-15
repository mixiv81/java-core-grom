package lesson30.task2;

import java.util.Objects;

public class Project {
    private String name;
    private Customer customer;

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", customer=" + customer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(name, project.name) &&
                Objects.equals(customer, project.customer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, customer);
    }
}