package ak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by kondz on 18.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        List<Person> employees = new ArrayList<Person>();
        employees.add(new Employee(31));
        employees.add(new Employee(12));
        employees.add(new Employee(17));
        employees.add(new Employee(3));
        employees.add(new Employee(1));
        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);

    }
}
