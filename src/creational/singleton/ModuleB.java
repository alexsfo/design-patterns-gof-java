package creational.singleton;

import creational.singleton.db.MyDatabaseClassic;

public class ModuleB {
	
	private static MyDatabaseClassic myDatabaseClassic;

	public static MyDatabaseClassic getDatabaseClassicModuleB() {
		myDatabaseClassic = MyDatabaseClassic.getInstance();
		myDatabaseClassic.add(new User("Joana", 10));
		myDatabaseClassic.add(new User("Roberto", 25));
		myDatabaseClassic.add(new User("Luiza", 80));
		return myDatabaseClassic;
	}

}
