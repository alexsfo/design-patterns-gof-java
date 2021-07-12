package creational.factoryMethod.utils;

import java.util.Random;

public class RandomNumbers {

    public static int getRandomNumbers(Integer lenght){
        return (int)(Math.random() * lenght );
    }

}
