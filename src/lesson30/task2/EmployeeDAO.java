package lesson30.task2;


import java.util.*;

public class EmployeeDAO {
    private Set<Employee> employeesDAO = new HashSet<>();
    private static Set<Project> projects = new HashSet<>();

    public EmployeeDAO() {
        Employee employee1 = new Employee("Ihor", "Zhluktenko", new Date(), Position.DEVELOPER, new Department(DepartmentType.DEVELOPERS));
        Employee employee2 = new Employee("Oleg", "Slusar", new Date(), Position.ANALYST, new Department(DepartmentType.FINANCE));
        Employee employee3 = new Employee("Ann", "Timkina", new Date(), Position.FINANCE, new Department(DepartmentType.FINANCE));
        Employee employee4 = new Employee("Alex", "Pushkin", new Date(), Position.DESIGNER, new Department(DepartmentType.DEVELOPERS));
        Employee employee5 = new Employee("Sergey", "Sedov", new Date(), Position.TEAM_LEAD, new Department(DepartmentType.DEVELOPERS));
        Employee employee6 = new Employee("Max", "Popov", new Date(), Position.MANAGER, new Department(DepartmentType.DEVELOPERS));
        Employee employee7 = new Employee("Den", "Morosov", new Date(), Position.LEAD_DESIGNER, new Department(DepartmentType.DEVELOPERS));

        employeesDAO.add(employee1);
        employeesDAO.add(employee2);
        employeesDAO.add(employee3);
        employeesDAO.add(employee4);
        employeesDAO.add(employee5);
        employeesDAO.add(employee6);
        employeesDAO.add(employee7);
    }

    public HashSet<Employee> employeesByProject(String projectName) throws Exception {
        if (projectName == null)
            throw new Exception("Input data can't be null");
        HashSet<Employee> findEmployees = new HashSet<>();
        for (Employee employee : employeesDAO) {
            if (employee != null && employee.getProjects().contains(projectName))
                findEmployees.add(employee);
        }
        return findEmployees;
    }

    public Collection projectsByEmployee(Employee employee) throws Exception {
        if (employee == null)
            throw new Exception("Input data can't be null");
        for (Employee em : employeesDAO) {
            if (em != null && em.equals(employee)) {
                return em.getProjects();
            }
        }
        throw new Exception("Employee can't be found");
    }

    public HashSet<Employee> employeesByDepartamentWithoutProject(DepartmentType departmentType) throws Exception {
        if (departmentType == null)
            throw new Exception("Input data can't be null");
        HashSet<Employee> findEmployees = new HashSet<>();
        for (Employee employee : employeesDAO) {
            if (employee != null && employee.getDepartment().getType().equals(departmentType) && employee.getProjects() == null) {
                findEmployees.add(employee);
            }
        }
        return findEmployees;
    }

    public HashSet<Employee> employeesWithoutProject() {
        HashSet<Employee> findEmployees = new HashSet<>();
        for (Employee employee : employeesDAO) {
            if (employee != null && employee.getProjects().size() == 0) {
                findEmployees.add(employee);
            }
        }
        return findEmployees;
    }

    public HashSet<Employee> employeesByTeamLead(Employee lead) throws Exception {
        if (lead == null)
            throw new Exception("Input data can't be null");
        if(lead.getPosition() != Position.TEAM_LEAD)
            throw new Exception("it is not team leader");
        HashSet<Employee> findEmployees = new HashSet<>();
        if (lead.getProjects() == null)
            return findEmployees;
        for (Project project : lead.getProjects())
            for (Employee employee : employeesDAO) {
                if (employee != null && employee.getProjects().contains(project)) {
                    findEmployees.add(employee);
                }
            }
        return findEmployees;
    }

}
