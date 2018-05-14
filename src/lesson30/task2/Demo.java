package lesson30.task2;

import java.util.Date;

public class Demo {

    public static void main(String[] args) throws Exception {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Employee employee5 = new Employee("Sergey", "Sedov", new Date(), Position.TEAM_LEAD, new Department(DepartmentType.DEVELOPERS));

        employeeDAO.employeesByTeamLead(employee5);

    }
}
