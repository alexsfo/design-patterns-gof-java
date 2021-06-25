package creational.builder;

import creational.builder.classes.MainDishBuilder;
import creational.builder.classes.MealBox;
import creational.builder.classes.VeganDishBuilder;

public class Main {

	public static void main(String[] args) {

		System.out.println("---------- MainDishBuilder ----------");
		MainDishBuilder mainDishBuilder = new MainDishBuilder();
		mainDishBuilder.makeMeal().makeDessert();
		System.out.println(mainDishBuilder.getMeal());
		System.out.println(mainDishBuilder.getPrice());

		System.out.println("---------- VeganDishBuilder ----------");
		VeganDishBuilder veganDishBuilder = new VeganDishBuilder();
		veganDishBuilder.makeMeal();
		System.out.println(veganDishBuilder.getMeal());

		veganDishBuilder.reset().makeMeal().makeBeverage().makeDessert().makeDessert();
		MealBox veganBox = veganDishBuilder.getMeal();
		System.out.println(veganBox);
		System.out.println(veganBox.getPrice());
	}
}
