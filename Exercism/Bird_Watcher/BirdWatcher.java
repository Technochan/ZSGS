
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] {0,2,5,3,7,8,4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int n : birdsPerDay) {
            if(n == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdsCountAtStartOfTheWeek = 0;
        for(int i=0 ; i < numberOfDays && i < birdsPerDay.length ; i++)  birdsCountAtStartOfTheWeek += birdsPerDay[i];
        return birdsCountAtStartOfTheWeek;
    }

    public int getBusyDays() {
        int busyDayCount = 0;
        for(int n : birdsPerDay) {
            if(n >= 5) busyDayCount++;
        }
        return busyDayCount;
    }
}
