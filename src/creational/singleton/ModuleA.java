package creational.singleton;

import creational.singleton.db.MyDatabaseClassic;

public class ModuleA {
	
	private static MyDatabaseClassic myDatabaseClassic;
	
	public static MyDatabaseClassic getDatabaseClassicModuleA() {
		myDatabaseClassic = MyDatabaseClassic.getInstance();
		myDatabaseClassic.add(new User("Luiz", 30));
		myDatabaseClassic.add(new User("Maria", 50));
		myDatabaseClassic.add(new User("Eduardo", 25));
		return myDatabaseClassic;
	}

}
