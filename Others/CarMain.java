package mar_27_2023_oops;
/*
Create a class called "Car" with the following specifications:

The class should have private instance variables: "brand" (String), "model" (String), "year" (int), and "mileage" (double).
The class should have a constructor that takes parameters for "brand," "model," "year," and "mileage" and initializes the instance variables accordingly.
The class should have getter and setter methods for all the instance variables.
The class should have a method called "drive" that takes a parameter "distance" (double) and increases the "mileage" instance variable by the given distance.
The class should have a method called "displayInfo" that prints out the brand, model, year, and mileage of the car.
Now, create another class called "CarMain" that contains the main method. In the main method, perform the following tasks:

Create an object of the Car class and initialize it with the following values: brand = "Toyota," model = "Camry," year = 2020, mileage = 5000.
Display the initial information of the car using the "displayInfo" method.
Drive the car for a distance of 150.
Display the updated information of the car using the "displayInfo" method.
Your task is to implement the "Car" class and the "CarMain" class according to the specifications provided.
 */
class Car {
    private String brand;
    private String model;
    private int year;
    private double mileage;
    
    public Car(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }
    
    // Getter and Setter methods
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public double getMileage() {
        return mileage;
    }
    
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    
    public void drive(double distance) {
        mileage += distance;
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
    }
}

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 5000);
        car.displayInfo();
        
        car.drive(150);
        car.displayInfo();
    }
}
