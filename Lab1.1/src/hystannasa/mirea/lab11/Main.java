package hystannasa.mirea.lab11;

import java.lang.String;

public class Main
{
    public static void main(String[] args) throws Exception {
        PersonTest personTest = new PersonTest();
        personTest.test();

        ClientTest client = new ClientTest();
        client.test();

        EmployeeTest employee = new EmployeeTest();
        employee.test();

        PersonExceptionTest personExceptionTest = new PersonExceptionTest();
        personExceptionTest.test();
    }
}