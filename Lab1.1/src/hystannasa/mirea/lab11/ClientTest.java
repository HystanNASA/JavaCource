package hystannasa.mirea.lab11;

public class ClientTest {
    ClientTest() {}

    public void test() {
        Client client1 = new Client();

        System.out.println("=== CLIENT TEST ===");

        try {
            client1.setName("Roman");
            client1.setPrice(100.0f);
            client1.setService("IT");
            System.out.println(client1.think());
            System.out.println(client1.getName());
            System.out.println(client1.getPrice());
            System.out.println(client1.getService());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
