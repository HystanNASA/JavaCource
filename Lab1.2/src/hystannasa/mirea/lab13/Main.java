package hystannasa.mirea.lab13;

public class Main {
    public static void main(String[] args) {
        BallTest ballTest = new BallTest();
        BookTest bookTest = new BookTest();
        DogTest dogTest = new DogTest();
        AuthorTest authorTest = new AuthorTest();

        ballTest.testBallClass();
        bookTest.testBookClass();
        dogTest.testDogClass();
        authorTest.test();

    }
}
