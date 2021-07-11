package creational.prototype.otherExample;

public class Rectangle extends Shape {

    private int width;
    private int weight;

    public Rectangle(){};

    public Rectangle(Rectangle source){
        super(source);
        this.weight = source.getWeight();
        this.width = source.getWidth();
    }

    public Shape clone(){
        return new Rectangle(this);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
