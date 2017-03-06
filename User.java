
public class User {

	private String name;
	private String surname;
	private String login;
	private int age;


	public User(String login) {
		this.login = login;
	}
	public User() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String display () {
		return "Czesc, nazywam sie "+name+" " +surname+"Mam "+age+" lat.";
		}
	public String toString() {
		return display();

	}
	public void isAdult() {
		if (age>=18) {
		System.out.println("U¿ytkownik jest pelnoletni");

		}
		else {
		System.out.println("U¿ytkownik nie jest pelnoletni");
		}
		}
	}






