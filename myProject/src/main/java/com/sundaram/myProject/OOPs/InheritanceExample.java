package com.sundaram.myProject.OOPs;

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an object of ElectricCar
        ElectricCar myElectricCar = new ElectricCar("Tesla", "Model S", 2022, true);

// Call methods from both parent and child classes
        myElectricCar.displayInfo();  // Output: Brand: Tesla, Model: Model S, Year: 2022
        myElectricCar.displayType();  // Output: Is Electric: true
    }
}
// Define a subclass (ChildClass) inheriting from superclass (ParentClass)
class ElectricCar extends Car {
    boolean isElectric;

    // Constructor for ElectricCar
    ElectricCar(String brand, String model, int year, boolean isElectric) {
        super(brand, model, year);  // Call the constructor of the parent class
        this.isElectric = isElectric;
    }

    // Method specific to ElectricCar
    void displayType() {
        System.out.println("Is Electric: " + isElectric);
    }
}

