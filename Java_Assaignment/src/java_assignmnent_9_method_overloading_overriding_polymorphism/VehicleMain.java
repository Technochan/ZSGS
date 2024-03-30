package java_assignmnent_9_method_overloading_overriding_polymorphism;


abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    @Override
    void start(){
        System.out.println("Car is Started");
    }
    @Override
    void stop(){
        System.out.println("Car is Stopped");
    }
}

class Bus extends Vehicle {
    @Override
    void start(){
        System.out.println("Bus is Started");
    }
    @Override
    void stop(){
        System.out.println("Bus is Stopped");
    }
}

class Bike extends Vehicle {
    @Override
    void start(){
        System.out.println("Bike is Started");
    }
    @Override
    void stop(){
        System.out.println("Bike is Stopped");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
        Vehicle bus = new Bus();
        bus.start();
        bus.stop();
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}
