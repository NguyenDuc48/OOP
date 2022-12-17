package hw6;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1, 2, 3, 4, 5);
        System.out.println(ball);
        ball.setRadius(55);
        System.out.println(ball);
    }
}
