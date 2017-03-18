package home;

/**
 * Created by kondz on 18.03.2017.
 */
public class Circle extends Shape {
    private int r;
    private double pi = Math.PI;

    //Constructos
    public Circle (int r) {
        this.r = r;
    }
    public Circle () {

    }
    //Sets and gets

    public void setR (int r) {
        this.r = r;
    }
    public int getR () {
        return r;
    }
    //Methods
    protected double calculateArea () {
        area = pi*r*r;
        return area;
    }

    @Override
    protected double calculateArea(boolean check) {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }

    public String sayMyType () {
        return "I'm Circle";
    }

    @Override
    public int getY() {
        return 0;
    }
}
