package pkg2;

/**
 * Created by kondz on 19.03.2017.
 */
public class Employee {
    //pola klasy
    protected String name;
    protected  String surname;
    protected  int born;
    protected float employed;
    protected Employee manager;
    protected double salary;

    //Konstruktory
    public Employee(String name, String surname, int born, float employed) {
        this.name = name;
        this.surname = surname;
        this.born = born;
        this.employed = employed;
    }

    public Employee(String name, String surname, int born, float employed, Employee manager) {
        this.name = name;
        this.surname = surname;
        this.born = born;
        this.employed = employed;
        this.manager = manager;
    }

    public Employee() {
    }

    //settery
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBorn(int born) {
        this.born = born;
    }

    public void setEmployed(float employed) {
        this.employed = employed;
    }

    //Gettery
    public String getName() {

        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBorn() {
        return born;
    }

    public float getEmployed() {
        return employed;
    }

    public void setManager(Employee manager) {
        manager = manager;
    }

    public Employee getManag() {

        return manager;
    }

//Metody
    public String getInfo() {
        return "Informacje o pracowniku:\n " + "Imie: " + name + "\nNazwisko: " + surname + "\nRok urodzenia: " + "\nZatrudniony od: " + employed + "\nManager: " + manager;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", born=" + born +
                ", employed=" + employed +
                ", manager=" + manager +
                '}';
    }

    public String getManager() {
        if (manager == null) {
            return "Pracownik nie ma manadzera";
        } else {
            return getInfo();
        }
    }
    public double getSalary() {

        return salary;
        }
    }

