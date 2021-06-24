package creational.builder.classes;

import creational.builder.interfaces.MealCompositeProtocol;

public abstract class AbstractMeal implements MealCompositeProtocol {

	private String name;
	
	private double price;

	public AbstractMeal() {};

	public AbstractMeal(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "Item: " + name + ", Preço: " + price + "\n";
	}

}
