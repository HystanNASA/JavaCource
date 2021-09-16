package hystannasa.mirea.lab11;

public class PersonExceptionTest {
    PersonExceptionTest() {}

    public void test() throws Exception {
        PersonException person1 = new PersonException();

        System.out.println("=== PERSON EXCEPTION TEST ===");

        try {
            person1.setName("Roman");
            person1.setAge(19);
            person1.setHeight(1.8f);
            person1.setGender(PersonException.Gender.MALE);
            person1.info();
        } catch(Exception e) {
            e.printStackTrace();
        }

        PersonException person2 = new PersonException();
        try {
            person2.setName("");
            person2.setAge(19);
            person2.setHeight(1.8f);
            person2.setGender(PersonException.Gender.MALE);
            person2.info();
        } catch (Exception e) {
            e.printStackTrace();
        }

        PersonException person3 = new PersonException();
        try {
            person3.setName("Roman");
            person3.setAge(-1);
            person3.setHeight(1.8f);
            person3.setGender(PersonException.Gender.MALE);
            person3.info();
        } catch (Exception e) {
            e.printStackTrace();
        }

        PersonException person4 = new PersonException();
        try {
            person4.setName("Roman");
            person4.setAge(19);
            person4.setHeight(-1.8f);
            person4.setGender(PersonException.Gender.MALE);
            person4.info();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
