package Need_For_Speed;
class NeedForSpeed {

    private int speed;
    private int remainingBattery = 100;
    private int drivenDistance;
    private int batteryDrain;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return remainingBattery <= 0;

    }

    public int distanceDriven() {
        return drivenDistance;
    }

    public void drive() {
        remainingBattery -= batteryDrain;
        if(remainingBattery >= 0){
            drivenDistance += speed;
        }

    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {

    private int raceTrackDistance;

    RaceTrack(int distance) {
        raceTrackDistance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (car.distanceDriven() < raceTrackDistance && !car.batteryDrained()) {
            car.drive();
        }
        return car.distanceDriven() >= raceTrackDistance;
    }

}
