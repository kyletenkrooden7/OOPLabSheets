package labsheet5.exercise1;

//TestBook.java
/*A driver class for the Book class based on Exercise 5 which gets the user to create objects
* for their favourite and least-favourite books, using user-supplied values on input dialogs*/

import labsheet4.Exercise5.Book;

import javax.swing.*;
import java.awt.*;
import labsheet3.exercise1.Computer;

public class TestBook {
    public static void main(String[] args) {
        String title, ISBN, output = "";
        double price;
        int pages;
        Computer c1 = new Computer();

        System.out.println(c1.getManufacturer());

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        textArea.setText(String.format("%-25s%-9s%-25s%s","Title","Price","ISBN","Pages"));


        title = JOptionPane.showInputDialog("Please enter the title of your favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your favourite book"));

        Book favouriteBook = new Book(title,price,ISBN,pages);

        output += String.format("\n\n%-25s%-9.2f%-25s%d",favouriteBook.getTitle(),favouriteBook.getPrice(),
                   favouriteBook.getISBN(),favouriteBook.getPages());

        title = JOptionPane.showInputDialog("Please enter the title of your least favourite book");
        price = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favourite book"));
        ISBN = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");
        pages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your least favourite book"));

        Book leastFavouriteBook = new Book(title,price,ISBN,pages);

        output += String.format("\n\n%-25s%-9.2f%-25s%d",leastFavouriteBook.getTitle(),leastFavouriteBook.getPrice(),
                leastFavouriteBook.getISBN(),leastFavouriteBook.getPages());

        textArea.append(output);

        JOptionPane.showMessageDialog(null,textArea,"Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
