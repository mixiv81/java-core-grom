package lesson30.task2;


import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Controller {
    private EmployeeDAO employeeDAO = new EmployeeDAO();
    private ProjectDAO projectDAO = new ProjectDAO();

    public LinkedList<Employee> employeesByProject(String projectName) throws Exception {
        return employeeDAO.employeesByProject(projectName);
    }

    public HashSet<Employee> employeesByDepartamentWithoutProject(DepartmentType departmentType) throws Exception {
        return employeeDAO.employeesByDepartmentWithoutProject(departmentType);
    }

    public HashSet<Employee> employeesWithoutProject() {
        return employeeDAO.employeesWithoutProject();
    }

    public LinkedList<Employee> employeesByTeamLead(Employee lead) throws Exception {
        return employeeDAO.employeesByTeamLead(lead);
    }

    public LinkedList<Employee> teamLeadsByEmployee(Employee employee) throws Exception {
        return employeeDAO.teamLeadsByEmployee(employee);
    }

    public LinkedList<Employee> employeesByProjectEmployee(Employee employee) throws Exception {
        return employeeDAO.employeesByProjectEmployee(employee);
    }

    public LinkedList<Employee> employeesByCustomerProjects(Customer customer) throws Exception {
        return employeeDAO.employeesByCustomerProjects(customer);
    }

    public Collection projectsByEmployee(Employee employee) throws Exception {
        return projectDAO.projectsByEmployee(employee);
    }

    public LinkedList<Project> projectsByCustomer(Customer customer) throws Exception {
        return projectDAO.projectsByCustomer(customer);
    }
}
