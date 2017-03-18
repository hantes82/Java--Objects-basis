package home;

/**
 * Created by kondz on 18.03.2017.
 */
public class Rectangle extends Shape {
    private int a;
    private int b;


    //Constructors
    public Rectangle(int a, int b) {
        this.setA(a);
        this.setB(b);
        this.calculateArea();
    }

    public Rectangle(int a, int b, String name) {
        super(name);
        this.a = a;
        this.b = b;
        this.calculateArea();
    }

    public Rectangle() {

    }

    //Sets gets
    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    //Methods
    protected double calculateArea() {
        area = a * b;
        return area;
    }

    protected double calculateArea(boolean check) {
        if (check && (a <= 0 || b <= 0)) {
            throw new IllegalArgumentException("error");
        } else {
            return calculateArea();
        }

    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }
}