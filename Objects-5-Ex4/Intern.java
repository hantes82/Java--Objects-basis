package pkg2;

/**
 * Created by kondz on 19.03.2017.
 */
public class Intern extends Employee {


    //Konstruktory
    public Intern(String name, String surname, int born) {

        super(name, surname, born, 0);
    }

    public Intern() {
    }

    public String getInfo() {
        return "Informacje o pracowniku:\n " + "Imie: " + name + "\nNazwisko: " + surname + "\nRok urodzenia: "+born;

    }

    @Override
    public void setEmployed(float employed) {

        this.employed = 0;
    }



}
