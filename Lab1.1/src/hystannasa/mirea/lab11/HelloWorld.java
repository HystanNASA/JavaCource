package hystannasa.mirea.lab11;

import java.lang.String;

public class HelloWorld
{
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        PersonException personExc = new PersonException();

        test(person);
        test(personExc);
    }

    private static void test(Person person)
    {
        person.setName("Roman");
        person.setAge(19);
        person.setHeight(1.8f);
    }

    private static void test(PersonException person) throws Exception {
        person.setName("Roman");
        person.setAge(19);
        person.setHeight(1.8f);
        person.setGender(PersonException.Gender.MALE);
        person.info();
    }
}