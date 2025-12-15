abstract class Vehicle {
    abstract double calculateSpeed();
    abstract double calculateVelocity();
}

class Car extends Vehicle {
    private double distance, time, disp;

    Car(double distance, double time, double disp) {
        this.distance = distance;
        this.time = time;
        this.disp = disp;
    }

    double calculateSpeed() {
        return distance / time;
    }

    double calculateVelocity() {
        return disp / time;
    }
}

class Bike extends Vehicle {
    private double distance, time, disp;

    Bike(double distance, double time, double disp) {
        this.distance = distance;
        this.time = time;
        this.disp = disp;
    }

    double calculateSpeed() {
        return distance / time;
    }

    double calculateVelocity() {
        return disp / time;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle car = new Car(5, 30, 4);
        Vehicle bike = new Bike(6, 30, 5);

        System.out.println("Car speed: " + car.calculateSpeed());
        System.out.println("Car velocity: " + car.calculateVelocity());

        System.out.println("Bike speed: " + bike.calculateSpeed());
        System.out.println("Bike velocity: " + bike.calculateVelocity());
    }
}