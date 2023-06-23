public class StepTracker {

    private int totalDays;
    private int activeDays;
    private double steps;
    private double activeStepQuota;


    public StepTracker(double quota){
        this.totalDays = 0;
        this.activeDays = 0;
        this.steps = 0;
        this.activeStepQuota = quota;
    }


    public double averageSteps(){
        return totalDays == 0 ? 0 : (steps/totalDays);
    }

    public int getActiveDays(){
        return activeDays;
    }

    public void addDailySteps(double steps){
        this.steps += steps;
        if(steps >= activeStepQuota){
            activeDays++;
        }
        totalDays++;
    }

    public void changeActiveSteps(double newQuota){
        this.activeStepQuota = newQuota;
    }





}