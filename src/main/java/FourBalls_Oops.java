import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBalls_Oops extends PApplet{
    public static final int HEIGHT = 500;
    public static final int WIDTH = 500;
    public static List<Ball> balls = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("FourBalls_Oops",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        for (int i = 1; i < 5; i++) {
            balls.add(new Ball(0,HEIGHT*i/5));
        }
    }

    @Override
    public void draw() {
        for (int i = 0; i < 4; i++) {
           Ball ball= balls.get(i);
            ball.drawCircle(this);
            ball.speedOfBall(i+1);
        }
    }
}
