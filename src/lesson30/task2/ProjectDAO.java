package lesson30.task2;

import java.util.*;


public class ProjectDAO {
    private static ArrayList<Project> projectsDAO = new ArrayList<>();
    private Set<Employee> employeesDAO = new HashSet<>();

    public ArrayList<Project> getProjectsDAO() {
        return projectsDAO;
    }

    public ProjectDAO() {
        Project project1 = new Project("aaa");
        Project project2 = new Project("bbb");
        projectsDAO.add(project1);
        projectsDAO.add(project2);

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

    public LinkedList<Project> projectsByCustomer(Customer customer) throws Exception {
        if (customer == null)
            throw new Exception("Input data can't be null");

        LinkedList<Project> projects = new LinkedList<>();

        for (Project project : projectsDAO){
            if (project != null && project.getCustomer().equals(customer)){
                projects.add(project);
            }
        }
        return projects;
    }
}
