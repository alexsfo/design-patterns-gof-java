package creational.AbstractFactory.vehicle;
import creational.AbstractFactory.interfaces.Customer;
import creational.AbstractFactory.interfaces.Vehicle;

public class EnterpriseCar implements Vehicle {

    private Customer customer;
    private String name;

    public EnterpriseCar(String name, Customer customer){
        this.name = name;
        this.customer = customer;
    }

    @Override
    public void pickup() {
        System.out.println("está buscando " + this.customer.);
    }
}
