package java_assignment_7_class_and_object_and_encapsulation;
// Create Flight DTO class. Create appropriate instance variables, static variables and methods with appropriate access modifiers.
public class FlightDTO {

    // Instance variables
    private String flightNumber;
    private String flightName;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private int seatCapacity;
    private double price;

    // Static variable to maintain unique id
    private static int flightCount = 0;

    // Constructor
    public FlightDTO(String flightNumber, String flightName, String origin, String destination, String departureTime, String arrivalTime, double price) {
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        flightCount++;
    }

    // method to get the number of flights
    public int getFlightCount() {
        return flightCount;
    }


    // Getters and setters methods
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
}
