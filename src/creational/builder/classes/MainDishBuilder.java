package creational.builder.classes;

import creational.builder.classes.meals.Beans;
import creational.builder.classes.meals.Beverage;
import creational.builder.classes.meals.Dessert;
import creational.builder.classes.meals.Meat;
import creational.builder.classes.meals.Rice;
import creational.builder.interfaces.MealBuilderProtocol;

public class MainDishBuilder implements MealBuilderProtocol {

	private MealBox meal = new MealBox();

	@Override
	public MealBuilderProtocol makeMeal() {
		Rice rice = new Rice("arroz", 5.0);
		Beans beans = new Beans("feijão", 10.0);
		Meat meat = new Meat("carne", 20.0);
		this.meal.add(rice, beans, meat);
		return this;
	}

	@Override
	public MealBuilderProtocol makeBeverage() {
		Beverage beverage = new Beverage("Bebida", 7.0);
		this.meal.add(beverage);
		return this;
	}

	@Override
	public MealBuilderProtocol makeDessert() {
		Dessert dessert = new Dessert("Sobremesa", 10.0);
		this.meal.add(dessert);
		return this;
	}

	public MealBox getMeal() {
		return meal;
	}

	public MealBuilderProtocol reset() {
		this.meal = new MealBox();
		return this;
	}
	
	public double getPrice() {
		return this.meal.getPrice();
	}
	
	

}
