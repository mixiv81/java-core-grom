package lesson30.task2;

import java.util.*;

public class Demo {

    public static void main(String[] args) throws Exception {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        LinkedList<Project> projects = new LinkedList<>();

        Project project1 = new Project("aaa");
        Project project2 = new Project("bbb");

        projects.add(project1);
        projects.add(project2);


        Employee employee1 = new Employee("Ihor", "Zhluktenko", new Date(), Position.DEVELOPER, new Department(DepartmentType.DEVELOPERS), projects);
        Employee employee2 = new Employee("Oleg", "Slusar", new Date(), Position.ANALYST, new Department(DepartmentType.FINANCE), projects);
        Employee employee3 = new Employee("Ann", "Timkina", new Date(), Position.FINANCE, new Department(DepartmentType.FINANCE), projects);
        Employee employee4 = new Employee("Alex", "Pushkin", new Date(), Position.DESIGNER, new Department(DepartmentType.DEVELOPERS), projects);
        Employee employee5 = new Employee("Sergey", "Sedov", new Date(), Position.TEAM_LEAD, new Department(DepartmentType.DEVELOPERS), projects);

        System.out.println(employeeDAO.employeesByTeamLead(employee5));

    }
}
