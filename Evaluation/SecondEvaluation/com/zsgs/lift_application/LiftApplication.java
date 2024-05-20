package SecondEvaluation.com.zsgs.lift_application;

import SecondEvaluation.com.zsgs.lift_application.lift_control.LiftControlView;

public class LiftApplication {

    private static LiftApplication liftApplication;

    private String appName = "Lift Application System";

    private String appVersion = "0.0.1";

    public static LiftApplication getInstance(){
        if(liftApplication == null){
            liftApplication = new LiftApplication();
        }
        return liftApplication;
    }

    public static void main(String[] args) {
        new LiftControlView().initiateControl();
    }

    public void setAppName(String appName){
        this.appName = appName;
    }

    public void setAppVersion(String appVersion){
        this.appVersion = appVersion;
    }

    public String getAppName(){
        return appName;
    }

    public String getAppVersion(){
        return appVersion;
    }

}
