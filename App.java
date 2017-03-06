import java.util.ArrayList;
import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u = new User("user123");
		u.setName("John");
		System.out.println (u.getName());
		u.setSurname("Connor");
		System.out.println (u.getSurname());
		u.setLogin("John123");
		System.out.println (u.getLogin());
		u.setAge(10);
		System.out.println (u.getAge());
		
		
		User u2 = new User();
		u2.setName("Frank");
		System.out.println (u2.getName());
		u2.setSurname("Dux");
		System.out.println (u2.getSurname());
		u2.setLogin("Frank123");
		System.out.println (u2.getLogin());
		u2.setAge(30);
		System.out.println (u2.getAge());
		System.out.println(u.display());
		System.out.println(u2.display());
	
	
		ArrayList <User> list = new ArrayList <User>();
		
		list.add(u);
		list.add(u2);
		
		for (User s : list) {
			System.out.println(s.display());
	
			
			Iterator <User> iterator = list.iterator();
			
			while (iterator.hasNext()) {
				User element = iterator.next();
				
				System.out.println(element.display());

			}

		}
		
		u.isAdult();
		u2.isAdult();
		
		
	}

}
