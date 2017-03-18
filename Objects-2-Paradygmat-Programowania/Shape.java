package home;

/**
 * Created by kondz on 18.03.2017.
 */
public abstract class Shape implements Figure, Coordinates {                  //dodajemy abstract zeby mozna bylo uzywac calculateArea zamiast dublowac
    protected String name;
    protected double area;
    protected abstract double calculateArea();   // metoda wystepujaca w obu dziedziczacych ustawiona na abstract
    protected abstract double calculateArea(boolean check);
    public double getArea() {
        this.calculateArea();
        return this.area;
    }

    public String sayMyType() {
      return "I'm Type " +name;
    }
    public Shape (String name) {
        this.name = name;
    }
    public Shape () {

    }


    public int getX() {
        return -1;
    }
    public int gety() {
        return -1;
    }

}
