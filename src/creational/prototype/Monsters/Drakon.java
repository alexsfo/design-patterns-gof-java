package headfirst.designpatterns.prototype;

public class Drakon extends Monster {
	public Drakon(String name, int numHeads, boolean canBreatheFire) {
		super(name);
		this.numHeads = numHeads;
		this.canBreatheFire = canBreatheFire;
	}
	public void spitPoison() {
		System.out.println(this.name + " spits poison");
	}
	// Each concrete monster could determine how best to clone itself
	public Monster clone() throws CloneNotSupportedException {
		return new Drakon(this.name, this.numHeads, this.canBreatheFire);
	}
}