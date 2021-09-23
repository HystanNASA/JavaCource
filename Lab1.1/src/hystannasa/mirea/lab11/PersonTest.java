package hystannasa.mirea.lab11;

public class PersonTest {

    PersonTest() {}

    public void test() {
        Person person1 = new Person();

        System.out.println("=== PERSON TEST ===");

        try {
            person1.setName("Roman");
            person1.setAge(19);
            person1.setHeight(1.8f);
            person1.info();
            System.out.println(person1.getName());
            System.out.println(person1.getAge());
            System.out.println(person1.getHeight());
            System.out.println(person1.isValid());
        } catch(Exception e) {
            e.printStackTrace();
        }

        Person person2 = new Person();
        try {
            person2.setName("");
            person2.setAge(19);
            person2.setHeight(1.8f);
            person2.info();
            System.out.println(person2.getName());
            System.out.println(person2.getAge());
            System.out.println(person2.getHeight());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person person3 = new Person();
        try {
            person3.setName("Roman");
            person3.setAge(-1);
            person3.setHeight(1.8f);
            person3.info();
            System.out.println(person3.getName());
            System.out.println(person3.getAge());
            System.out.println(person3.getHeight());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person person4 = new Person();
        try {
            person4.setName("Roman");
            person4.setAge(19);
            person4.setHeight(-1.8f);
            person4.info();
            System.out.println(person4.getName());
            System.out.println(person4.getAge());
            System.out.println(person4.getHeight());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
