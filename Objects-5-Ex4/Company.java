package pkg2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * Created by kondz on 19.03.2017.
 */
public class Company {
    private String companyName;

    public static void main(String[] args) {


        Employee e1 = new Employee("Ala", "Kowalska", 1980, 20);
        Employee e2 = new Employee();
        Employee e3 = new Employee("sss", "gfggd", 1981, 21);
        PermanentEmployee e4 = new PermanentEmployee ("Imie", "Nazwisko", 1993, 15, null, 5123.45);
        PermanentEmployee e5 = new PermanentEmployee ("Imie1", "Nazwisko1", 1995, 11, e4, 2000.45);
        Employee e6 = new PermanentEmployee ("Imie2", "Nazwisko2", 1911, 2,  e5, 5123.45);
        //private List <Employee> employees - dla dodawania elementow listy 2 sposob

//        System.out.println(e1.getInfo());
//        System.out.println(e2.getInfo());

        List<Employee> lista = new ArrayList<Employee>();

        lista.add(e1);
        lista.add(e2);
//
//        for (Employee e : lista) {
//
//            System.out.println(e.getInfo());
//
//        }

//        Iterator<Employee> it1 = lista.iterator();
//
//        while (it1.hasNext()) {
//
//            Employee element = it1.next();
//
//            System.out.println(element.getInfo());
//
//        }
        //public void addEmployee(Employee...employees) {  - dla dodawania elementow do listy 2 sposob
        //this.employees.addAll(Arrays.asList(employees))}
//    private void initList() {
//            if(this.employees == null) {}
//            this.employees = new ArrayList<>();
//    }
//    }
//        Employee e5 = new Employee("Jan", "Kowalski", 1980, 20, e3);

//        System.out.println(e5.getManager());
//        System.out.println(e5.getManag());

        lista.add(e5);


        Intern in1 = new Intern();
        Intern in2 = new Intern("John", "Doe", 1921);

        lista.add(in1);
        lista.add(in2);

        System.out.println(in2.getInfo());

        PermanentEmployee e7 = new PermanentEmployee("Jan", "Kowalski", 1989, 20, (PermanentEmployee) e4, 20000);

        lista.add(e7);

//        System.out.println(e7.salary);
//
//        for (Employee e : lista) {
//            if (e instanceof PermanentEmployee) {
//                System.out.println(e.getSalary());
//            }
//        }


                    System.out.println(PermanentEmployee.salarySum());
            Employee i1 = new Intern("John","Rambo",1999);
        System.out.println(i1);
        System.out.println(i1.getSalary());
        }
    }
