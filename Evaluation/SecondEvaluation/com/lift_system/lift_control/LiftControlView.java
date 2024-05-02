package SecondEvaluation.com.lift_system.lift_control;

import SecondEvaluation.com.lift_system.erroemessage.ErrorMessage;
import SecondEvaluation.com.lift_system.exceptionhandling.ExceptionHandle;
import SecondEvaluation.com.lift_system.model.Lift;

import java.util.ArrayList;
import java.util.Scanner;

public class LiftControlView {

    private LiftControlModel liftControlModel;
    private static Scanner scan ;
    public LiftControlView(){
        liftControlModel = new LiftControlModel(this);
        scan = new Scanner(System.in);

    }
    public void initiateControl() {
        createLifts();
        displayLiftFloor();
        startLiftUsage();
    }

    public void startLiftUsage() {
        int input ;
        do{
            System.out.println("1.Use Lift\n2.Lift UnderMaintenance\n3.Exit");
            input = ExceptionHandle.getIntInput();

            switch (input){
                case 1 : assaignLift();
                    break;
                case 2 : setUnderMaintenance();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while(input != 2);
    }



    public void assaignLift() {
        System.out.println();
        System.out.println("Totally 10 Floors");
        System.out.println("Enter Current Floor : ");
        int currentFloor = ExceptionHandle.getIntInput();

        System.out.println("How Many peoples wants to get in :");
        int peopleCount = ExceptionHandle.getIntInput();
        boolean isValidCount = liftControlModel.isValidCount(peopleCount);
        int destinationFloor = -1;

        if(isValidCount){
            System.out.println("Enter the Destination floor :");
            destinationFloor = ExceptionHandle.getIntInput();
        } else {
            System.out.println("People Count exceeds the Lift Capacity");
            return;
        }
        if((currentFloor < 0 || currentFloor > 10) || (destinationFloor < 0 || destinationFloor > 10) ){
            ErrorMessage.printErrorMessage("Invalid Input - (floors must between 1 - 10)");
            return;
        }
        liftControlModel.assaignLift(currentFloor,destinationFloor);
        System.out.println();
    }

    public void showAssaignedLift(String message){
        System.out.println(
                "*****************************\n"+
                        message+
                        "\n*****************************"
        );
        displayLiftFloor();
    }

    //Display List With its Current floor
    public void displayLiftFloor(){
        ArrayList<Lift> liftList = liftControlModel.getLiftList();
        System.out.println("Lift  |  Current Floor\n--------------------");
        for(Lift lift : liftList){
            System.out.println(lift.getLiftName()+"    |    "+ lift.getCurrentFloor());
        }
    }

    public void setUnderMaintenance() {
        ArrayList<Lift> liftList = liftControlModel.getLiftList();
        System.out.println("Lift  |  Current Floor\n--------------------");
        for(Lift lift : liftList){
            System.out.println(lift.getLiftName()+"    |    "+ lift.getCurrentFloor());
        }
        System.out.println("Enter the lift Name which is under Maintenance");
        String name = scan.next();
        liftControlModel.setMaintenance(name);
    }


    // Creating Lift
    public void createLifts() {
        System.out.println("Enter Lift Count");
        int liftCount = ExceptionHandle.getIntInput();

        Lift lift;
        for(int i = 1 ; i <= liftCount ; i++){
            lift = new Lift();
            lift.setLiftName("L"+i);
            lift.setCurrentFloor(0);

            System.out.println("Enter the Lift "+i+" Capacity");
            int capacity = ExceptionHandle.getIntInput();
            lift.setCapacity(capacity);

            System.out.println("Enter the Lift "+i+" Starting Access Floor");
            int startAccess = ExceptionHandle.getIntInput();
            lift.setAcccessStartFloorLimit(startAccess);

            System.out.println("Enter the Lift "+i+" End Access Floor");
            int endAccess = ExceptionHandle.getIntInput();
            lift.setAcccessEndFloorLimit(endAccess);

            lift.setWorking(true);
            liftControlModel.addLiftList(lift);
        }
    }
}
