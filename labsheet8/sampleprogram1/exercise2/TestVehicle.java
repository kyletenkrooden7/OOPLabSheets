package labsheet8.sampleprogram1.exercise2;

public class TestVehicle {
    public static void main(String[] args) {
        String text= "";

        Car car1 = new Car();
        text+="Testing the Car no-arg constructor.\n" + car1.toString();

        Car car2 = new Car(100000.0,4.5,1.25,2000.0,"Ferrari", "F2",2,"05KY1");
        text+="\n\nTesting the Car multi-arg constructor. \n" + car2.toString();

        Bicycle bicycle1 = new Bicycle();
        text+="\n\nTesting the bicycle no-arg constructor.\n" + bicycle1.toString();

        Bicycle bicycle2 = new Bicycle(5000,1.5,1.0,50.0,"Raleigh","Mountainbike",4, true); //fix hasBell
        text+="\n\nTesting the bicycle no-arg constructor.\n" + bicycle2.toString();

        System.out.println(text);

    }
}
