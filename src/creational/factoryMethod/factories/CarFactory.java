package creational.factoryMethod.factories;

import creational.factoryMethod.vehicle.Car;
import creational.factoryMethod.vehicle.Vehicle;

public class CarFactory extends VehicleFactory {

    @Override
    public Car getVehicle(String vehicleName) {
        return new Car(vehicleName);
    }

}
