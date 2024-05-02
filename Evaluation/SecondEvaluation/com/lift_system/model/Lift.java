package SecondEvaluation.com.lift_system.model;

public class Lift {

    private String liftName;
    private int currentFloor;
    private int acccessStartFloorLimit ;
    private int acccessEndFloorLimit ;
    private int capacity;
    private boolean isWorking;

    public void setLiftName(String liftName){
        this.liftName = liftName;
    }
    public void setCurrentFloor(int currentFloor){
        this.currentFloor = currentFloor;
    }
    public void setAcccessStartFloorLimit(int acccessStartFloorLimit){
        this.acccessStartFloorLimit = acccessStartFloorLimit;
    }
    public void setAcccessEndFloorLimit(int acccessEndFloorLimit){
        this.acccessEndFloorLimit = acccessEndFloorLimit;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public void setWorking(boolean woking){
        isWorking = woking;
    }
    public String getLiftName(){
        return liftName;
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
    public int getAcccessStartFloorLimit(){
        return acccessStartFloorLimit;
    }
    public int getAcccessEndFloorLimit(){
        return acccessEndFloorLimit;
    }
    public int getCapacity(){
        return capacity;
    }
    public boolean getWorking(){
        return isWorking;
    }
}
