package creational.prototype.otherExample;

public class Circle extends Shape {

    private int radius;

    public Circle() {};

    public Circle(Circle source) {
        super(source);
        this.radius = source.getRadius();
    }

    public Circle clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
