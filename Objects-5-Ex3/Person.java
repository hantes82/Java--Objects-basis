package pkg;

/**
 * Created by kondz on 19.03.2017.
 */
public class Person {

    //pola klasy
    private String name;
    private String surname;
    private int age;
    private String gender;

    //gettery
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    //settery
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //Konstruktor
    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;

    }

    public Person() {

    }
}
