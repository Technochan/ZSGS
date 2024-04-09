package Elons_Toy_Car;

public class ElonsToyCar {
    private int distanceDriven;
    private int batteryUsage = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    public String distanceDisplay() {
        return "Driven "+ this.distanceDriven +" meters";
    }
    public String batteryDisplay() {
        if(this.batteryUsage <=0){
            return "Battery empty";
        } else {
            return "Battery at "+ this.batteryUsage +"%";
        }
    }
    public void drive() {
        if(this.batteryUsage > 0){
            this.distanceDriven += 20;
        }
        this.batteryUsage--;
    }
}