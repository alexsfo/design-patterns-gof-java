package creational.factoryMethod.utils;

import creational.factoryMethod.factories.BicycleFactory;
import creational.factoryMethod.factories.CarFactory;
import creational.factoryMethod.utils.RandomNumbers;
import creational.factoryMethod.vehicle.Bicycle;
import creational.factoryMethod.vehicle.Car;
import creational.factoryMethod.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomVehicleAlgorithm {

    public static Vehicle getrandonVehicle(){
        CarFactory  carFactory = new CarFactory();
        BicycleFactory bicycleFactory = new BicycleFactory();

        Car car1 = carFactory.getVehicle("Fusca");
        Car car2 = carFactory.getVehicle("Celta");
        Car car3 = carFactory.getVehicle("Lamborghini");
        Bicycle bike = bicycleFactory.getVehicle("Bicicleta Urbana");
        Bicycle bike2 = bicycleFactory.getVehicle("Bicicleta ciclismo");
        Bicycle bike3 = bicycleFactory.getVehicle("Bicicleta dobŕavel");



        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.addAll(Arrays.asList(car1, car2, car3, bike, bike2, bike3));

        return vehicles.get(RandomNumbers.getRandomNumbers(5));
    }

}
