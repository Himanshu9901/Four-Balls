import processing.core.PApplet;

public class Ball extends PApplet {
    public static final int height = 20;
    public static final int width = 20;
    private int xAxis;
    private int yAxis;

    public Ball(int xAxis, int yAxis){

        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }
    public void drawCircle(PApplet pApplet){
        pApplet.ellipse(this.xAxis,yAxis, width, height);
        
    }
    public void speedOfBall(int speed){
        this.xAxis +=speed;
    }

}
