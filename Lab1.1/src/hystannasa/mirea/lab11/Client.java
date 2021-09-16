package hystannasa.mirea.lab11;

public class Client extends AbstractPerson {
    private String service;
    private float price;

    Client(String name) { super(name); }

    Client() { super(); }

    @Override
    public String think() {
        return "I'm a client";
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
