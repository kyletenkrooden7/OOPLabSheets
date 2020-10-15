package labsheet8.sampleprogram1.exercise1;

public class Bicycle extends Vehicle{
    private int gearCount;
    private boolean hasBell;

    public Bicycle()
    {
        setGearCount(gearCount);
        setHasBell(hasBell);


    }

    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model, int gearCount, boolean hasBell) {
        super(price, length, height, weight, manufacturer, model);
        setGearCount(gearCount);
        setHasBell(hasBell) ;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }


    public String toString() {
      String str= "\nHasbell:" + isHasBell() + "\nGear Count: " + getGearCount();

      return super.toString() + str;

    }
}
