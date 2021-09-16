package hystannasa.mirea.lab13;

public class BallTest {
    public void testBallClass() {
        System.out.println("=== BALL TEST ===");

        Ball ball = new Ball();
        ball.setRadius(1);
        ball.setJumpingAbility(1);
        ball.setManufacturingCompany("Ball company");
        System.out.println(ball.toString());
        System.out.println(ball.bounceOff(100, 10));
    }
}
