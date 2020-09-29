package labsheet1;

//SnackDeal.java
/*A short program which reads in a students name and course, then asks how many snacks they would
like to buy before displaying some information including the total cost of the snacks*/

import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args) {
        String name, course;
        int snacks;

        name = JOptionPane.showInputDialog("Please enter your name");
        course = JOptionPane.showInputDialog("Please enter your course");
        snacks = Integer.parseInt(JOptionPane.showInputDialog("How many snacks would you like?"));

        JOptionPane.showMessageDialog(null,"Name: " + name +
                                     "\nCourse: " + course + "\nSnacks: " + snacks + "\nCost: €" + (snacks*2),
                                     "Receipt",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
