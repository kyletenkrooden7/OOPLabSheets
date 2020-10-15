package labsheet6.exercise1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {
        String text="", firstName,lastName;



        text = "*****Person Class Tester*****";

        Person person1 = new Person();

        text += "\n\nCalling the Person() constructor ..... \nValue of first Person object is: " + person1.toString();

        firstName = JOptionPane.showInputDialog("Please enter the first name of the second person");

       lastName = JOptionPane.showInputDialog("Please enter the last name of the second person");

        Person person2 = new Person(firstName, lastName);

        text += "\n\nCalling the Person(String, String) constructor after getting user-supplied values ....."+
                "\nValue of second person object is: " + person2;

        JOptionPane.showMessageDialog(null,text,"",JOptionPane.INFORMATION_MESSAGE);
    }
}
