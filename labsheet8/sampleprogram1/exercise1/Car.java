package labsheet8.sampleprogram1.exercise1;

public class Car extends Vehicle{
    private int maxPassengers;
    private String registrationNumber;



    public Car()
    {
        setRegistrationNumber(registrationNumber);
        setMaxPassengers(maxPassengers);

    }

    public Car(double price, double length, double height, double weight, String manufacturer, String model, int maxPassengers, String registrationNumber) {
        super(price, length, height, weight, manufacturer, model);
        setMaxPassengers(maxPassengers);
        setRegistrationNumber(registrationNumber);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    public String toString() {
        String str = "\nMax passengers: " + getMaxPassengers() +
                "\nRegistration Number: ";

        if(registrationNumber == null)
            str+= "No registration number specified";

        else
            str+= getRegistrationNumber();

        return super.toString() + str;
    }
}
