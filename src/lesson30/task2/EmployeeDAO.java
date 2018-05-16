package lesson30.task2;


import java.util.*;

public class EmployeeDAO {
    private static ArrayList<Employee> employeesDAO = new ArrayList<>();
    private ArrayList<Project> projects = new ArrayList<>();


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

    public LinkedList<Employee> employeesByProject(String projectName) throws Exception {
        if (projectName == null)
            throw new Exception("Input data can't be null");
        LinkedList<Employee> findEmployees = new LinkedList<>();
        for (Employee employee : employeesDAO) {
            if (employee != null && employee.getProjects() != null && employee.getProjects().contains(projectName))
                findEmployees.add(employee);
        }
        return findEmployees;
    }

    public HashSet<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType) throws Exception {
        if (departmentType == null)
            throw new Exception("Input data can't be null");
        HashSet<Employee> findEmployees = new HashSet<>();
        for (Employee employee : employeesDAO) {
            if (employee != null && employee.getDepartment().getType().equals(departmentType) && employee.getProjects().size() == 0) {
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

    public LinkedList<Employee> employeesByTeamLead(Employee lead) throws Exception {
        if (lead == null)
            throw new Exception("Input data can't be null");
        if (lead.getPosition() != Position.TEAM_LEAD)
            throw new Exception("it is not team leader");

        LinkedList<Employee> findEmployees = new LinkedList<>();

        if (lead.getProjects() == null)
            return findEmployees;

        LinkedList<Project> projectsLead = new LinkedList<>();
        projectsLead.addAll(lead.getProjects());

        for (Project project : projectsLead) {
            for (Employee employee : employeesDAO) {
                if (project != null && !employee.equals(lead) && employee.getProjects().contains(project)) {
                    findEmployees.add(employee);
                }
            }
        }
        return findEmployees;
    }

    public LinkedList<Employee> teamLeadsByEmployee(Employee employee) throws Exception {
        if (employee == null)
            throw new Exception("Input data can't be null");
        if (employee.getPosition() == Position.TEAM_LEAD)
            throw new Exception("it is team leader");

        LinkedList<Employee> findEmployees = new LinkedList<>();

        if (employee.getProjects() == null)
            return findEmployees;
        LinkedList<Project> projects = (LinkedList<Project>) employee.getProjects();

        for (Employee em : employeesDAO) {
            for (Project project : projects) {
                if (project != null && em.getPosition().equals(Position.TEAM_LEAD) && em.getProjects().contains(project)) {
                    findEmployees.add(em);
                }
            }
        }
        return findEmployees;
    }

    public LinkedList<Employee> employeesByProjectEmployee(Employee employee) throws Exception {
        if (employee == null)
            throw new Exception("input data can't be null");

        LinkedList<Employee> findEmployees = new LinkedList<>();

        if (employee.getProjects() == null)
            return findEmployees;

        LinkedList<Project> projects = (LinkedList<Project>) employee.getProjects();

        for (Employee em : employeesDAO) {
            for (Project project : projects) {
                if (em != null && project != null && em.getProjects().contains(project))
                    findEmployees.add(em);
            }
        }
        return findEmployees;
    }

    public LinkedList<Employee> employeesByCustomerProjects(Customer customer) throws Exception {
        if (customer == null)
            throw new Exception("input data can't be null");

        LinkedList<Employee> findEmployees = new LinkedList<>();

        for (Employee em : employeesDAO) {
            for (Project project : projects) {
                if (em != null && project != null && project.getCustomer().equals(customer))
                findEmployees.add(em);
            }
        }
        return findEmployees;
    }
}
