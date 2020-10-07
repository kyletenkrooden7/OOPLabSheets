package labsheet2;

import javax.swing.*;

public class ComputerData {
    public static void main(String[] args) {
        String serial, Processor;
        int harddisk;
        float price;


        serial = JOptionPane.showInputDialog("Please enter the serial number(<CR> to exit");

        harddisk = Integer.parseInt(JOptionPane.showInputDialog("Please enter the hard-disk space"));

        if(harddisk <50 || harddisk>5000 || harddisk<0 )
            JOptionPane.showInputDialog("Invalid! Please re-enter hard-disk space");






    }



}
