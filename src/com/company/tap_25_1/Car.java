package com.company.tap_25_1;

public class Car {
    private int id;
    private String numberOfCar;

    public Car(int id, String numberOfCar) {
        this.id = id;
        this.numberOfCar = numberOfCar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(String numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", numberOfCar='" + numberOfCar + '\'' +
                '}';
    }
}
