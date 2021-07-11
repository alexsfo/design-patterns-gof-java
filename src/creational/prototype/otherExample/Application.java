package creational.prototype.otherExample;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        circle.setRadius(20);
        shapes.add(circle);

        Circle anotherCircle = circle.clone();

        Rectangle rec = new Rectangle();
        rec.setX(10);
        rec.setY(10);
        rec.setWeight(10);
        rec.setWidth(10);
        rec.setColor("blue");

        shapes.add(rec);

    }


}
