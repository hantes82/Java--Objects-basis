package home;

/**
 * Created by kondz on 18.03.2017.
 */
public class Triangle extends Shape {
    private int a;
    private int h;

    private boolean isQuadratic;

    //Constructors
    public Triangle (int a, int h) {
        this.a = a;
        this.h = h;
        this.calculateArea();
    }

    public Triangle (int a) {
        this(a,10);
    }
    public Triangle () {
        this(1,2);
    }
       //setery i getery

    public void setA() {
        this.a = a;
    }
    public int getA() {
       return this.a;
    }
    public void setH() {
        this.h = h;
    }
    public int getH() {
        return this.h;
    }


    //Methods

    protected double calculateArea() {
        area = a*h/2;
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
        return "I'm Triangle";
    }

    @Override
    public int getY() {
        return 0;
    }
}


