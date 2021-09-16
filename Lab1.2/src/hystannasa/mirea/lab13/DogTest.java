package hystannasa.mirea.lab13;

public class DogTest {
    public void testDogClass() {
        System.out.println("=== DOG TEST ===");

        Dog dog = new Dog();
        dog.setName("Kubik");
        dog.setAge(6);
        System.out.println(dog.toString());
        System.out.println(dog.getHumanAge());
    }
}
