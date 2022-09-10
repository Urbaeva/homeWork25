package com.company.tap_25_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car, CarData> carHashMap = new HashMap<>();
        Car car1 = new Car(1, "4343");
        Car car2 = new Car(2, "1545");
        Car car3 = new Car(3, "5425");

        CarData carData1 = new CarData(1956, "Sedan", 65000, "gray");
        CarData carData2 = new CarData(1978, "Truck", 165000, "white");
        CarData carData3 = new CarData(1997, "BMW", 89000, "black");

        carHashMap.put(car1, carData1);
        carHashMap.put(car2, carData2);
        carHashMap.put(car3, carData3);

        for (HashMap.Entry car: carHashMap.entrySet()) {
            System.out.println(car.getKey() + " " + car.getValue());
        }
    }
}
