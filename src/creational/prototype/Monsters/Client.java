package headfirst.designpatterns.prototype;

public class Client {
	public static void main(String[] args) {
		Monster p1 = new Dragon("Dragon", true);
		Monster p2 = new Drakon("Drakon", 3, true);
		
		// ... later ...
		operation(p1);
		operation(p2);
	}
	
	public static void operation(Monster p) {
		// This code doesn't know or care what the concrete type of p is
		Monster pClone = null;
		try {
			pClone = p.clone();
			System.out.println(pClone);
			p.setName("otherName");
			System.out.println(pClone);
			System.out.println(pClone.toString());
			System.out.println("Operating with pClone!");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}