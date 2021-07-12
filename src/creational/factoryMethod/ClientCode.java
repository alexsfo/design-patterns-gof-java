package creational.factoryMethod;

import creational.factoryMethod.factories.BicycleFactory;
import creational.factoryMethod.factories.CarFactory;
import creational.factoryMethod.utils.RandomNumbers;
import creational.factoryMethod.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientCode {

    public static void main(String[] args) {
        BicycleFactory bicycleFactory = new BicycleFactory();
        CarFactory carFactory = new CarFactory();

        Vehicle bike = bicycleFactory.getVehicle("Caloi");
        Vehicle car = carFactory.getVehicle("HB20");

        List<Vehicle> vehicles = new ArrayList<>();
        String[] customerNames  = {"Joana", "Samanta", "Penelope", "Joaquina", "Jonas", "Francisco", "Eufranio", "Afonso", "Gertrudez"};

        for (int i = 0; i <= 20 ; i++){
            vehicles.add(RandomVehicleAlgorithm.getrandonVehicle());
            String name = customerNames[RandomNumbers.getRandomNumbers(customerNames.length)];
            vehicles.get(i).pickup(name);
            vehicles.get(i).stop();
            System.out.println("--------------------------------");
        }


    }
}
