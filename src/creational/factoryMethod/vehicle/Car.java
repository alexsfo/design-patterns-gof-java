package creational.factoryMethod.vehicle;

public class Car implements  Vehicle {

    private String name;

    public Car(String name){
        this.name = name;
    }

    @Override
    public void pickup(String customerName) {
        System.out.println(this.getName() + " está buscando o " + customerName);
    }

    @Override
    public void stop() {
        System.out.println(this.getName() + " parou");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
