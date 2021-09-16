package hystannasa.mirea.exercise1;

public class Main {
    public static void main(String[] args) {
        testDogClass();
        testBallClass();
        testBookClass();
    }

    private static void testDogClass() {
        Dog dog = new Dog();
        dog.setName("Kubik");
        dog.setAge(6);
        System.out.println(dog.toString());
        System.out.println(dog.getHumanAge());
    }

    private static void testBallClass() {
        Ball ball = new Ball();
        ball.setRadius(1);
        ball.setJumpingAbility(1);
        ball.setManufacturingCompany("Ball company");
        System.out.println(ball.toString());
        System.out.println(ball.bounceOff(100, 10));
    }

    private static void testBookClass() {
        Book book = new Book("Thus Spoke Zarathustra", "Friedrich Nietzsche", 1883, 401);
        System.out.println(book.toString());
    }
}
