interface Drivable {
    // Abstract methods - must be implemented by any class that implements Drivable
    void drive();
    void stop();

    // Default method - provides a default implementation
    default void park() {
        System.out.println("Vehicle is parked");
    }

    // Static method - can be called on the interface itself
    static void service() {
        System.out.println("Vehicle is being serviced");
    }
}

class Car implements Drivable {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }

    // Optionally override the default method
    @Override
    public void park() {
        System.out.println("Car is parked");
    }
}

class Bike implements Drivable {
    @Override
    public void drive() {
        System.out.println("Bike is driving");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped");
    }

    // Use the default park() method from the interface
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Drivable car = new Car();
        car.drive();    // Output: Car is driving
        car.stop();     // Output: Car has stopped
        car.park();     // Output: Car is parked

        Drivable bike = new Bike();
        bike.drive();   // Output: Bike is driving
        bike.stop();    // Output: Bike has stopped
        bike.park();    // Output: Vehicle is parked (default method)

        // Static method called on the interface
        Drivable.service();  // Output: Vehicle is being serviced
    }
}
