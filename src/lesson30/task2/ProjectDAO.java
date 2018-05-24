package lesson30.task2;

import java.util.*;


public class ProjectDAO {
    private static ArrayList<Project> projects = new ArrayList<>();
    private LinkedList<Employee> employees = new LinkedList<>();

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public ProjectDAO() {
        Project project1 = new Project("aaa");
        Project project2 = new Project("bbb");
        projects.add(project1);
        projects.add(project2);

    }
    public Collection projectsByEmployee(Employee employee) throws Exception {
        if (employee == null)
            throw new Exception("Input data can't be null");
        for (Employee em : employees) {
            if (em != null && em.equals(employee)) {
                return em.getProjects();
            }
        }
        throw new Exception("Employee can't be found");
    }

    public LinkedList<Project> projectsByCustomer(Customer customer) throws Exception {
        if (customer == null)
            throw new Exception("Input data can't be null");

        LinkedList<Project> findProjects = new LinkedList<>();

        for (Project project : projects){
            if (project != null && project.getCustomer().equals(customer)){
                findProjects.add(project);
            }
        }
        return findProjects;
    }
}
