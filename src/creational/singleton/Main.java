package creational.singleton;

import creational.singleton.db.MyDatabaseClassic;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		MyDatabaseClassic singleton = MyDatabaseClassic.getInstance();

		singleton.show();

		MyDatabaseClassic singletonFromModuleA = ModuleA.getDatabaseClassicModuleA();

		singleton.show();

		MyDatabaseClassic singletonFromModuleB = ModuleB.getDatabaseClassicModuleB();

		singleton.show();
	}

}
