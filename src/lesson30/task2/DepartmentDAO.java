package lesson30.task2;

import java.util.ArrayList;
import java.util.HashSet;

public class DepartmentDAO {
    private static ArrayList<Department> departmentDAO = new ArrayList<>();

    public static ArrayList<Department> getDepartmentDAO() {
        return departmentDAO;
    }

    private DepartmentDAO(){
        Department department1 = new Department(DepartmentType.DEVELOPERS);
        Department department2 = new Department(DepartmentType.FINANCE);

        departmentDAO.add(department1);
        departmentDAO.add(department2);
    }
}
