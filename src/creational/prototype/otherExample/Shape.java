package creational.prototype.otherExample;

public abstract class Shape {

    private int x;
    private int y;
    private String color;

    public Shape() {};

    public Shape(Shape source) {
        this.x = source.getX();
        this.y = source.getY();
        this.color = source.getColor();
    }

    public abstract Shape clone();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
