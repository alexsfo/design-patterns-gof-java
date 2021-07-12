package creational.factoryMethod.factories;

import creational.factoryMethod.vehicle.Bicycle;
import creational.factoryMethod.vehicle.Vehicle;

public class BicycleFactory extends VehicleFactory {

    @Override
    public Bicycle getVehicle(String vehicleName) {
        return new Bicycle(vehicleName);
    }


}
