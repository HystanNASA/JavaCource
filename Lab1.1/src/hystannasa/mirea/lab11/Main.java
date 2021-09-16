package hystannasa.mirea.lab11;

import java.lang.String;

public class Main
{
    public static void main(String[] args) throws Exception {
        PersonExceptionTest personExceptionTest = new PersonExceptionTest();
        personExceptionTest.test();

        PersonTest personTest = new PersonTest();
        personTest.test();

        ClientTest client = new ClientTest();
        client.test();

        EmployeeTest employee = new EmployeeTest();
        employee.test();
    }

    private static void test(Person person) {
        person.setName("Roman");
        person.setAge(19);
        person.setHeight(1.8f);
    }
}