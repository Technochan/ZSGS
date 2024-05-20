package SecondEvaluation.com.zsgs.lift_application.lift_control;

import SecondEvaluation.com.zsgs.lift_application.model.Lift;

import java.util.ArrayList;

class LiftControlViewModel {

    private LiftControlView liftControlView;
    private ArrayList<Lift> liftList;

    public LiftControlViewModel(LiftControlView liftControlView) {
        this.liftControlView = liftControlView;
        liftList = new ArrayList<>();
    }

    public void addLiftList(Lift lift) {
        liftList.add(lift);
    }

    public ArrayList<Lift> getLiftList() {
        return liftList;
    }

    public void assaignLift(int currentFloor, int destinationFloor) {
        Lift assaignedLift;
        if (currentFloor < destinationFloor) {
            assaignedLift = getNearestUpwardLift(currentFloor, destinationFloor);
            if (assaignedLift == null) assaignedLift = getNearestDownwardLift(currentFloor, destinationFloor);
        } else {
            assaignedLift = getNearestDownwardLift(currentFloor, destinationFloor);
            if (assaignedLift == null) assaignedLift = getNearestUpwardLift(currentFloor, destinationFloor);
        }
        if (assaignedLift != null)
            changeLiftFloor(assaignedLift, destinationFloor);
        else
            liftControlView.showAssaignedLift("No Lifts are available");
    }

    public void changeLiftFloor(Lift assaignedLift, int destinationFloor) {
        for (Lift lift : liftList) {
            if (lift.getLiftName().equals(assaignedLift.getLiftName())) {
                lift.setCurrentFloor(destinationFloor);
            }
        }
        liftControlView.showAssaignedLift(assaignedLift.getLiftName() + " is Assigned");
    }

    public Lift getNearestUpwardLift(int currentFloor, int destinationFloor) {
        Lift preferedLift = null;
        int floor = 1;
        int minTravel = Integer.MAX_VALUE;
        for (Lift lift : liftList) {
            if (((currentFloor == 0 || lift.getAcccessStartFloorLimit() <= currentFloor) && (destinationFloor == 0 || destinationFloor <= lift.getAcccessEndFloorLimit()))
                    && ((lift.getCurrentFloor() >= currentFloor || lift.getCurrentFloor() <= currentFloor) && (lift.getCurrentFloor() > floor || lift.getCurrentFloor() < floor))
                    && lift.getWorking()) {
                if ((lift.getAcccessEndFloorLimit() - lift.getCurrentFloor() < minTravel)) {
                    preferedLift = lift;
                    floor = lift.getCurrentFloor();
                    minTravel = lift.getAcccessEndFloorLimit() - lift.getCurrentFloor();
                }
            }
        }
        return preferedLift;
    }

    public Lift getNearestDownwardLift(int currentFloor, int destinationFloor) {
        Lift preferedLift = null;
        int floor = 10;
        int minTravel = Integer.MAX_VALUE;
        for (Lift lift : liftList) {
            if (((currentFloor == 0 || lift.getAcccessStartFloorLimit() <= currentFloor) && (destinationFloor == 0 || destinationFloor <= lift.getAcccessEndFloorLimit()))
                    && ((lift.getCurrentFloor() >= currentFloor || lift.getCurrentFloor() <= currentFloor) && (lift.getCurrentFloor() >= floor || lift.getCurrentFloor() <= floor))
                    && lift.getWorking()) {
                if (lift.getAcccessEndFloorLimit() - lift.getCurrentFloor() < minTravel) {
                    preferedLift = lift;
                    floor = lift.getCurrentFloor();
                    minTravel = lift.getAcccessEndFloorLimit() - lift.getCurrentFloor();
                }
            }
        }
        return preferedLift;
    }

    public boolean isValidCount(int peopleCount) {
        for (Lift lift : liftList) {
            if (lift.getCapacity() >= peopleCount) return true;
        }
        return false;
    }

    public void setMaintenance(String name) {
        for (Lift lift : liftList) {
            if (lift.getLiftName().equals(name)) {
                lift.setWorking(false);
                lift.setCurrentFloor(-1);
            }
        }
    }
}
