package hystannasa.mirea.lab13;

public class BookTest {
    public void testBookClass() {
        System.out.println("=== BOOK TEST ===");
        Book book = new Book("Thus Spoke Zarathustra", "Friedrich Nietzsche", 1883, 401);
        System.out.println(book.toString());
    }
}
