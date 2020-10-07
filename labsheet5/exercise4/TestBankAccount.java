package labsheet5.exercise4;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {
        String text;

        BankAccount account1 = new BankAccount();

        text = "Calling the no-argument BankAccount constructor." +
                "The first BankAccount object details are: \n\n" +
                account1.toString();

        BankAccount account2 = new BankAccount("Richy Rich",2342343,0.75);

        text += "\n\nCalliing the multi-argument BankAccount constructor." +
                "The second BankAccount object details are: \n\n" +
                account2.toString();

        text+= "\n\nNow calling the setInterestRate() method to change the interest Rate to 0.5.\n";
        BankAccount.setInterestRate(0.5);

        text +="\nThe first Bank account details are: \n" + account1.toString();

        text +="\n\nThe second Bank account details are:\n " + account2.toString();




        JOptionPane.showMessageDialog(null,text,
                                     "BankAccount Object Data",
                                     JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);






    }
}
