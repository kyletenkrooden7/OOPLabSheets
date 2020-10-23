package labsheet9.exercise1;

public final class SelfEmployedWorker extends Employee{
    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName) {
        super(firstName, lastName);
        setEstimatedIncome(estimatedIncome);

    }


    public String toString() {
        return "Self-employed worker's name is " + super.toString() ;
    }

    public void setEstimatedIncome(double estimatedIncome) {
       this.estimatedIncome = estimatedIncome;
    }

    public double earnings() {
        int min = 400, max = 900;
        int range=max-min +1;
        int randomNum;
        randomNum = (int) (Math.random() * range + min);
        return randomNum;
    }
}
