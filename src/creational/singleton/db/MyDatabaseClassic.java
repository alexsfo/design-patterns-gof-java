package creational.singleton.db;

import java.util.ArrayList;
import java.util.List;

import creational.singleton.User;

public class MyDatabaseClassic {

	private static MyDatabaseClassic instance;

	private static List<User> users;

	private MyDatabaseClassic() {
	};

	public static MyDatabaseClassic getInstance() {
		if (instance == null) {
			instance = new MyDatabaseClassic();
			users = new ArrayList<User>();
		}
		return instance;
	}

	public void add(User user) {
		users.add(user);
	}

	public void remove(int index) {
		users.remove(index);
	}

	public void show() {
		for (User user : users) {
			System.out.println(user);
		}
		System.out.println("-------------------------");
	}
	
	public List<User> getUsers(){
		return MyDatabaseClassic.users;
	}

}
