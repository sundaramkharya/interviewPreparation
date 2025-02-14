package com.sundaram.myProject.OOPs;

// Define a simple Car class
class Car {
    String brand;
    String model;
    int year;
    public Car(){
        System.out.println("Parameter less constructor has been called ");
    }
    // Constructor to initialize the Car object
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display information about the car
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}
