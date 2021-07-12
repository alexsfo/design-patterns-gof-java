package creational.factoryMethod.factories;

import creational.factoryMethod.vehicle.Car;
import creational.factoryMethod.vehicle.Vehicle;

public abstract class VehicleFactory {

    //factory method
    public abstract Vehicle getVehicle(String vehicleName);

    public Vehicle pickUp(String customerName, String vehicleName) {
        Vehicle vehicle = new Car(vehicleName);
        vehicle.pickup(customerName);
        return vehicle;
    }

}
