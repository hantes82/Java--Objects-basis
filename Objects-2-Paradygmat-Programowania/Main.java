package home;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static java.lang.Math.sqrt;


public class Main {


    public static void main(String[] args) {

        Triangle t1 = new Triangle();   //default Constructor
        System.out.println(t1.getA());
        System.out.println(t1.getH());
        System.out.println(t1.getArea());
        Shape s1 = new Rectangle(10,10);
        Shape t2 = new Triangle();
        Shape s3 = new Rectangle(5,5, "Imie");
        System.out.println(s3.getArea());
        Circle c1 = new Circle(3);
        System.out.println(c1.getArea());

        System.out.println(s3.sayMyType());

        List<Shape> lista = new ArrayList<Shape>();
        lista.add(new Triangle(2,2));
        lista.add(new Rectangle(3,4));
        lista.add(new Circle(2));

        for (Shape sh : lista) {

            if (sh instanceof Triangle) {
                Triangle t = (Triangle) sh;
                System.out.println("H: " + t.getH());
            }

            double area = sh.getArea();
            if (area > 1.0) {
                System.out.println(sh.sayMyType());
            }

        }
    Iterator<Shape> it1 = lista.iterator();

        while (it1.hasNext()) {

            Shape listCheck = it1.next();
            System.out.println(listCheck.getArea());
            if (listCheck instanceof Triangle) {
                Triangle t = (Triangle) listCheck;
                System.out.println(t.sayMyType());
            }





        }
    List <Figure> figures = new ArrayList<>();

        figures.add(new Triangle(2,2));
        figures.add(new Rectangle(4, 3));
        figures.add(new Circle(2));
        for (Figure figure : figures) {
            System.out.println(figure.sayMyType());
        }}
    public void addFIgure (Figure n) {};
    public void addShape(Shape s) {};






}

