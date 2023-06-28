import processing.core.PApplet;

public class FourBalls_Procedural extends PApplet{
    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    static int x1=0,x2=0,x3=0,x4=0,speed;

    public static void main(String[] args) {
        PApplet.main("FourBalls_Procedural",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        circleWithHeight(1,x1);
        x1+=1;
        circleWithHeight(2,x2);
        x2+=2;
        circleWithHeight(3,x3);
        x3+=3;
        circleWithHeight(4,x4);
        x4+=4;
    }
    private void circleWithHeight(int height, int axis){
        ellipse(axis, HEIGHT *height/5, 20, 20);
    }
}
