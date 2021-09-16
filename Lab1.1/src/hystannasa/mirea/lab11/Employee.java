package hystannasa.mirea.lab11;

public final class Employee extends AbstractPerson {
    private String department;
    Position position;

    Employee() {}

    Employee(String name, String department, Position position) {
        super(name);
        this.department = department;
        this.position = position;
    }

    enum Position {
        MANAGER, SELLER
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String think() { return "I'm a employee"; }
}
