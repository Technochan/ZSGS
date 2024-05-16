package java_assignment_8_constructor_and_inheritance;
// Create Vehicle Hierarchy
// Base class representing a generic Vehicle
class Vehicle {
    private String companyName;
    private int oilCapacity;
    private int yearOfManufacture;
    private double topSpeed;

    public Vehicle(String companyName, int oilCapacity, int yearOfManufacture, double topSpeed) {
        this.companyName = companyName;
        this.oilCapacity = oilCapacity;
        this.yearOfManufacture = yearOfManufacture;
        this.topSpeed = topSpeed;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getOilCapacity() {
        return oilCapacity;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getTopSpeed(){
        return topSpeed;
    }

    public String getDescription() {
        return companyName + " " + oilCapacity + " " + yearOfManufacture+" "+topSpeed;
    }
}

class Car extends Vehicle {
    private int seatCount;

    public Car(String companyName, int oilCapacity, int yearOfManufacture, double topSpeed,int seatCount) {
        super(companyName, oilCapacity, yearOfManufacture,topSpeed);
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    @Override
    public String getDescription() {
        return super.getDescription()  + ", Seats in Car is: " + seatCount;
    }
}


class Bus extends Vehicle {
    private int seatCount;

    public Bus(String companyName, int oilCapacity, int yearOfManufacture, double topSpeed,int seatCount) {
        super(companyName, oilCapacity, yearOfManufacture,topSpeed);
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    @Override
    public String getDescription() {
        return super.getDescription()  + ", Seats in Bus is: " + seatCount;
    }
}


class Bike extends Vehicle {
    private int seatCount;

    public Bike(String companyName, int oilCapacity, int yearOfManufacture, double topSpeed,int seatCount) {
        super(companyName, oilCapacity, yearOfManufacture,topSpeed);
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Seats in Bike is: " + seatCount ;
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Car car = new Car("Audi", 20, 2022, 135.00,4);
        Bus bus = new Bus("PrivateBus", 35, 2015, 80,80);
        Bike bike = new Bike("KTM", 30, 2024, 200,2);


        System.out.println(car.getDescription());
        System.out.println(bus.getDescription());
        System.out.println(bike.getDescription());
    }
}
