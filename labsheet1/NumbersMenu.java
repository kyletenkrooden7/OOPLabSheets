package labsheet1;

import javax.swing.*;


public class NumbersMenu {
    public static void main(String[] args) {

        double Factorial;
        int i=0, choice,NoEntered;
        String text="";

        do {

            NoEntered = Integer.parseInt(JOptionPane.showInputDialog("------Iteration " + (i + 1) + "------" +
                    "\n\nPlease enter any whole number"));

            choice = Integer.parseInt(JOptionPane.showInputDialog("What would you like to do?" +
                    "\n\n1. Determine if the number is odd or even" +
                    "\n2.Find the factorial of the number" +
                    "\n3. Quit the program"));


            switch (choice)
            {
            case 1:

                if (NoEntered%2==0)
                    text+="\n\nThe number you entered is even";

                else
                    text+="\n\nThe number you entered is odd";

                break;

            case 2:

                if (NoEntered < 0)
                    text += "\n\nCannot get the factorial of a negative number!";

                else {
                    Factorial = 1;

                    for (int j = 1; j <= NoEntered; j++)
                        Factorial *= j;

                    text += "\n\nThe factorial of the number you entered is " + Factorial;

                }

                break;

            case 3:
                text += "\n\nQuitting the program earlier than anticipated .... goodbye";
            }

            JOptionPane.showMessageDialog(null, text,
                    "Number Data", JOptionPane.INFORMATION_MESSAGE);
            i++;
            text="";
    } while(i<10 && choice!=3);




    }
}
