package pkg2;

/**
 * Created by kondz on 19.03.2017.
 */
public class PermanentEmployee extends Employee implements HasSalary {

    private static double resultSalary = 0;

public static double salarySum() {

   return resultSalary;

}



    public PermanentEmployee(String name, String surname, int born, float employed, PermanentEmployee manager, double salary) {
        super(name, surname, born, employed, manager);
        this.salary = salary;
        resultSalary+=salary;


    }


    public void setManager(PermanentEmployee manager) {

    this.manager = manager;
    }
}
