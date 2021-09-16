package hystannasa.mirea.lab11;

public class EmployeeTest {
    EmployeeTest() {}

    public void test() {
        Employee employee1 = new Employee();

        System.out.println("=== CLIENT TEST ===");

        try {
            employee1.setName("Roman");
            employee1.setPosition(Employee.Position.MANAGER);
            employee1.setDepartment("IT");
            System.out.println(employee1.think());
            System.out.println(employee1.getName());
            System.out.println(employee1.getDepartment());
            System.out.println(employee1.getPosition());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
