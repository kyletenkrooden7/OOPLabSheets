package labsheet5.exercise3;



import javax.swing.*;
import java.awt.*;

public class TestThermometer {
    public static void main(String[] args) {
         String output="";
         int temperature;

         output ="*****Thermometer Testing*****\n\nCalling the single-argument constructor.... "+
                "setting the temperature of first thermometer to 35C";

        Thermometer t1 = new Thermometer(35);

        output += "\nFirst Thermometer: \n" + t1;

        Thermometer t2 = new Thermometer();

        output +="Calling the no-argument constructor.... "+
                "setting the temperature of second thermometer to 0C\nSecond Thermometer:\n" +
                t2.toString();


        output +="Calling setTemperature()...."+
                "setting the temperature of second thermometer to 25C\nSecond Thermometer:\n" +
                t2.toString();

        t2.setTemperature(25);

        JOptionPane.showMessageDialog(null,output,"",
                JOptionPane.INFORMATION_MESSAGE);

        temperature = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temp of the first thermometer"));

        output = "Calling setTemperature()....." +
                "setting the temperature of first thermometer to " + temperature + "C";
        t1.setTemperature(temperature);

        output +="\nFirst Thermometer: \n"+ t1;

        JOptionPane.showMessageDialog(null,
                output, "", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }



}
