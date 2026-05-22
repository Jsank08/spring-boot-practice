abstract class Vehicle {
    String name;

    // Constructor in an abstract class
    Vehicle(String name) {
        this.name = name;
        System.out.println("Base abstract class constructor called. Vehicle name: " + this.name);
    }

    abstract void start();
}

class Car extends Vehicle {
    Car(String name) {
        // Explicitly calling the parent constructor
        super(name);
        System.out.println("Child class constructor called.");
    }

    @Override
    void start() {
        System.out.println(name + " is starting...");
    }
}

public class AbstractInterface {
    public static void main(String[] args) {
        // Instantiating the child class triggers the abstract class constructor
        Car myCar = new Car("Tesla Model S");
        myCar.start();
    }
}
