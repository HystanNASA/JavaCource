package hystannasa.mirea.exercise1;

public class Ball {
    private double radius;
    private double jumpingAbility;
    private String manufacturingCompany;

    Ball() {}

    Ball(double radius, double jumpingAbility, String manufacturingCompany) {
        this.radius = radius;
        this.jumpingAbility = jumpingAbility;
        this.manufacturingCompany = manufacturingCompany;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getJumpingAbility() {
        return jumpingAbility;
    }

    public void setJumpingAbility(double jumpingAbility) {
        this.jumpingAbility = jumpingAbility;
    }

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }

    public void setManufacturingCompany(String manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }

    public double bounceOff(double initialHeight, double initialSpeed) {
        return (initialHeight + (initialSpeed * initialSpeed) / 2 * 10 * jumpingAbility);
    }

    @Override
    public String toString() {
        return "Ball { " +
                "radius: " + radius +
                ", jumpingAbility: " + jumpingAbility +
                ", manufacturingCompany: "  + manufacturingCompany +
                " }";
    }
}
