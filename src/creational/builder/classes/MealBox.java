package creational.builder.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import creational.builder.interfaces.MealCompositeProtocol;

public class MealBox implements MealCompositeProtocol {

	private List<MealCompositeProtocol> meals = new ArrayList<MealCompositeProtocol>();

	@Override
	public double getPrice() {
		return this.meals.stream().mapToDouble(o -> o.getPrice()).sum();
	}

	public void add(MealCompositeProtocol... items) {
		Stream.of(items).forEach(o -> meals.add(o));
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		this.meals.stream().forEach(o -> sb.append(o.toString()));
		return sb.toString();
	}
	

}
