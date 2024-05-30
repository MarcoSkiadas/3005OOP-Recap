package org.example;

public class Car {

    private String brand;
    private String model;
    private int yearOfManufacture;
    private String color;
    private int speed;

    public Car(String brand, String model, int yearOfManufacture, String color) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.speed = 0;
    }
    public void start() {
        System.out.println(brand+" "+model+" started");
    }
    public void accelerates() {
        this.speed++;
    }
}
