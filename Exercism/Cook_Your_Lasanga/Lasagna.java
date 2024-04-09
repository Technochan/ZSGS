package Cook_Your_Lasanga;

public class Lasagna {
    static final int TOTAL_COOKING_TIME = 40;

    public static int expectedMinutesInOven(){
        return TOTAL_COOKING_TIME;
    }

    public static int remainingMinutesInOven(int remainingMinutes){
        return  expectedMinutesInOven() - remainingMinutes;
    }
    public static int preparationTimeInMinutes(int preparationTime){
        return preparationTime*2;
    }

    public static int totalTimeInMinutes(int layersCount , int lasangaCookingTime){
        return preparationTimeInMinutes(layersCount) + lasangaCookingTime ;
    }
}