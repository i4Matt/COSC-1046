package ASSIGNMENT_5.Assi5.src;

// Car class definition
class Car {
    // Attributes (fields)
    String make;
    String model;
    int year;

    // Constructor to initialize the object
    public Car(String carMake, String carModel, int carYear) {
        // Direct assignment, no use of 'this'
        make = carMake;
        model = carModel;
        year = carYear;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    // Method to update the year of the car
    public void updateYear(int newYear) {
        year = newYear; // Directly update the field without 'this'
        System.out.println("Car year updated to: " + newYear);
    }
}

// Main class to create and manipulate objects
public class diagram {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car myCar = new Car("Toyota", "Corolla", 2020);
        Car yourCar = new Car("Honda", "Civic", 2018);

        // Displaying details of each car
        System.out.println("My Car Details:");
        myCar.displayDetails();

        System.out.println("\nYour Car Details:");
        yourCar.displayDetails();

        // Updating the year of 'myCar'
        System.out.println("\nUpdating My Car's Year...");
        myCar.updateYear(2022);

        // Displaying updated details of 'myCar'
        System.out.println("\nUpdated My Car Details:");
        myCar.displayDetails();
    }
}
