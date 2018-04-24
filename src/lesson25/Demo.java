package lesson25;

public class Demo {
    public static void main(String[] args) throws Exception {
        GeneralDAO generalDAO = new GeneralDAO();

        Order order = new Order(1);
        generalDAO.validate(order);

        TestClass<String, Order, Long> testClass = new TestClass<>();
        System.out.println(testClass.doSomething1("rrr"));

        int test = 100;
        long variable = 111;

        Long variable2 = 222L;

        generalDAO.validate(variable2);
        generalDAO.validate(variable);
        generalDAO.validate(test);
    }
}
