package hystannasa.mirea.lab13;

public class AuthorTest {
    AuthorTest() {}

    public void test() {
        System.out.println("=== AUTHOR TEST ===");

        Author author = new Author("Roman", "roman@email.com", 'm');

        System.out.println(author.toString());
        author.setEmail("Roman@email.com");
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
    }
}
