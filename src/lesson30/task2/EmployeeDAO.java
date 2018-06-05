package lesson30.task2;


import java.util.*;

public class EmployeeDAO {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Project> projects = new ArrayList<>();


    public EmployeeDAO() {
        Employee employee1 = new Employee("Ihor", "Zhluktenko", new Date(), Position.DEVELOPER, new Department(DepartmentType.DEVELOPERS), projects);
        Employee employee2 = new Employee("Oleg", "Slusar", new Date(), Position.ANALYST, new Department(DepartmentType.FINANCE), projects);
        Employee employee3 = new Employee("Ann", "Timkina", new Date(), Position.FINANCE, new Department(DepartmentType.FINANCE), projects);
        Employee employee4 = new Employee("Alex", "Pushkin", new Date(), Position.DESIGNER, new Department(DepartmentType.DEVELOPERS), projects);
        Employee employee5 = new Employee("Sergey", "Sedov", new Date(), Position.TEAM_LEAD, new Department(DepartmentType.DEVELOPERS), projects);
        Employee employee6 = new Employee("Max", "Popov", new Date(), Position.MANAGER, new Department(DepartmentType.DEVELOPERS),projects);
        Employee employee7 = new Employee("Den", "Morosov", new Date(), Position.LEAD_DESIGNER, new Department(DepartmentType.DEVELOPERS), projects);

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
    }

    public LinkedList<Employee> employeesByProject(String projectName) throws Exception {
        LinkedList<Employee> findEmployees = new LinkedList<>();
        for (Employee employee : employees) {
            if (employee != null && employee.getProjects() != null && employee.getProjects().contains(projectName))
                findEmployees.add(employee);
        }
        return findEmployees;
    }

    public LinkedList<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType) throws Exception {
        LinkedList<Employee> findEmployees = new LinkedList<>();
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment().getType().equals(departmentType) && employee.getProjects().size() == 0) {
                findEmployees.add(employee);
            }
        }
        return findEmployees;
    }

    public LinkedList<Employee> employeesWithoutProject() {
        LinkedList<Employee> findEmployees = new LinkedList<>();
        for (Employee employee : employees) {
            if (employee != null && employee.getProjects().size() == 0) {
                findEmployees.add(employee);
            }
        }
        return findEmployees;
    }

    public LinkedList<Employee> employeesByTeamLead(Employee lead) throws Exception {
        if (!lead.getPosition().equals(Position.TEAM_LEAD))
            throw new Exception("it is not team leader");

        LinkedList<Employee> findEmployees = new LinkedList<>();

        if (lead.getProjects() == null)
            return findEmployees;

        LinkedList<Project> projectsLead = new LinkedList<>();
        projectsLead.addAll(lead.getProjects());

        for (Project project : projectsLead) {
            if (project != null) {
                findEmployees.addAll(getEmployeesByProject(project));
            }
        }
        return findEmployees;
    }

    public LinkedList<Employee> teamLeadsByEmployee(Employee employee) throws Exception {
        if (employee.getPosition().equals(Position.TEAM_LEAD))
            throw new Exception("it is team leader");

        LinkedList<Employee> findEmployees = new LinkedList<>();

        if (employee.getProjects() == null)
            return findEmployees;

        ArrayList<Project> projects = (ArrayList<Project>) employee.getProjects();


        for (Project project : projects) {
            if (project != null)
                findEmployees.addAll(getEmployeesByProject(project));
        }

        if (findEmployees.size() == 0)
            return findEmployees;

        LinkedList<Employee> findLeads = new LinkedList<>();

        for (Employee empl : findEmployees) {
            if (empl.getPosition().equals(Position.TEAM_LEAD))
                findLeads.add(empl);
        }
        return findLeads;
    }

    public LinkedList<Employee> employeesByProjectEmployee(Employee employee) throws Exception {

        LinkedList<Employee> findEmployees = new LinkedList<>();

        if (employee.getProjects() == null)
            return findEmployees;

        ArrayList<Project> projects = (ArrayList<Project>) employee.getProjects();


        for (Project project : projects) {
                if (project != null)
                    findEmployees.addAll(getEmployeesByProject(project));
            }
        return findEmployees;
    }

    public LinkedList<Employee> employeesByCustomerProjects(Customer customer) throws Exception {

        LinkedList<Employee> findEmployees = new LinkedList<>();

        for (Employee em : employees) {
            for (Project project : projects) {
                if (em != null && project != null && project.getCustomer().equals(customer))
                    findEmployees.add(em);
            }
        }
        return findEmployees;
    }

    private LinkedList<Employee> getEmployeesByProject(Project project) {
        LinkedList<Employee> findProjects = new LinkedList<>();
        for (Employee employee : employees) {
            if (employee != null && employee.getProjects() != null && employee.getProjects().contains(project))
                findProjects.add(employee);
        }
        return findProjects;
    }
}
