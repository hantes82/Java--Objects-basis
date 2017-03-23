/**
 *
 */
public class Player {
    String name;
    String surname;
    int points;

    public Player(String name, String surname, int points) {
        this.name = name;
        this.surname = surname;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPoints() {
        return points;
    }

    public String fullName() {
        return name + " " + surname;
    }
}