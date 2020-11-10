package labsheet11.Exercise2;

//TestArrayList.java
/*A driver (test) class that contains the main() method for
testing the functionality of the LineItem and Product classes but this time
an array-list is used for maintaining a collection of LineItem objects and
a separate collection of Product objects. The driver is also testing out
the functionality of the ArrayList class*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestArrayList{
    public static void main(String[] args) {

        // Create Products
        Product p1 = new Product(1, "Red Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Black Marker", "This is a black permanent marker");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        Product p6 = new Product(6, "Protractor", "This is a protractor");
        Product p7 = new Product(7, "Refill Pad", "This is a 150 page refill pad");
        Product p8 = new Product(8, "Eraser", "This is an eraser");
        Product p9 = new Product(9, "Tippex", "This is tippex");
        Product p10 = new Product(10, "Stapler", "This is a stapler");
        Product p11 = new Product(11, "Black Pen","This is a black pen");
        Product p12 = new Product(12, "Blue Pen","This is a blue pen");
        Product p13 = new Product(13, "Red Marker", "This is a red permanent marker");
        Product p14 = new Product(14, "Blue Marker", "This is a blue permanent marker");
        Product p15 = new Product(15, "Calculator", "This is a Casio scientific calculator");

        //Create an array-list of Product objects
        ArrayList<Product> allProducts = new ArrayList<Product>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15));

        String choice;

        do {
            choice = JOptionPane.showInputDialog("1. Add a Product" + "\n2.Amend a Product" + "\n3. Remove a Product" +
                    "\n4. View all Products" + "\n5. Quit" +
                    "\n\nPlease enter your choice");

            int choiceAsInt = Integer.parseInt(choice);

            if(choiceAsInt < 1 || choiceAsInt > 5)
                choice = JOptionPane.showInputDialog("1. Add a Product" + "\n2.Amend a Product" + "\n3. Remove a Product" +
                        "\n4. View all Products" + "5. Quit" +
                        "\n\nInvalid choice entered!! Must be between 1 and 5 inclusive");




        switch(choice) {
            case "1":
                addProduct(allProducts);
                break;

            case "2":
                amendProduct(allProducts);
                break;

            case "3":
                removeProduct(allProducts);
                break;

            case "4":
                viewProducts(allProducts);
        }
        }while(!choice.equals("5"));

        JOptionPane.showMessageDialog(null,"Thanks for using the system!",
                "Farewell",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);


    }
    public static void addProduct(ArrayList<Product> allProducts)
    {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Please enter the product id"));
        String ProductName = JOptionPane.showInputDialog("Please enter the product name");
        String ProductDesc = JOptionPane.showInputDialog("Please enter the product description");

        Product p = new Product(id,ProductName, ProductDesc);

        allProducts.add(p);
        JOptionPane.showMessageDialog(null, "Product now created and added to the array list!",
                "Product Added", JOptionPane.INFORMATION_MESSAGE);


    }

    public static void amendProduct(ArrayList<Product> allProducts)
    {
        ArrayList<Product> foundProducts = new ArrayList<Product>();

        String Name = JOptionPane.showInputDialog("Please enter the name of the product you wish to amend");

       for(Product pr: allProducts)
           if(allProducts.contains(Name))
               foundProducts.add(pr);

        String text="";

        for (Product pr : foundProducts)
            if (pr != null) {
                text += pr + "\n";
            }

           int IdEntered = Integer.parseInt(JOptionPane.showInputDialog("The following products matched your search phrase\n\n" + text +
                   "\n\nEnter the id of the one you want to amend"));

        Product productToAmend=null;

        for (Product pr : foundProducts)
            if (pr != null && pr.getId()==IdEntered)
                productToAmend = pr;

        String amendChoice = JOptionPane.showInputDialog("The details of the product you wish to amend are:\n\n" +
                productToAmend + "\n\n1. Amend Name\n2. Amend Description" +
                "\n3. Cancel Amendment\n\nPlease enter your choice");

        int amendChoiceAsInt = Integer.parseInt(amendChoice);

        while(amendChoiceAsInt<1 || amendChoiceAsInt>3){
            amendChoice = JOptionPane.showInputDialog("The details of the product you wish to amend are:\n\n" +
                    productToAmend + "\n\n1. Amend Name\n2. Amend Description" +
                    "\n3. Cancel Amendment\n\nInvalid choice entered!! Must be a value between 1 and 3 inclusive");

            amendChoiceAsInt = Integer.parseInt(amendChoice);
        }

        switch(amendChoice){
            case "1":
                String newName = JOptionPane.showInputDialog("Please enter the new name for the product");

                productToAmend.setName(newName);

                break;

            case "2":
                String newDescription = JOptionPane.showInputDialog("Please enter the new description for the product");

                productToAmend.setDescription(newDescription);

                break;
        }

        JOptionPane.showMessageDialog(null,"Product details now amended!",
                "Product Amended",JOptionPane.INFORMATION_MESSAGE);
        foundProducts.clear();

    }

    public static void removeProduct(ArrayList<Product> allProducts)
    {

        ArrayList<Product> foundProducts = new ArrayList<Product>();
        String searchKey = JOptionPane.showInputDialog("Please enter the name of the product you wish to remove");

        for(Product pr: allProducts)
            if(pr.getName().toLowerCase().contains(searchKey.toLowerCase()))
                foundProducts.add(pr);

        String text="";

        for (Product pr : foundProducts)
            if (pr != null) {
                text += pr + "\n";
            }

        int searchID = Integer.parseInt(JOptionPane.showInputDialog("The following products matched your search phrase\n\n" + text +
                "\n\nPlease enter the id of the one you want to remove"));

        Product productToRemove=null;

        for (Product pr : foundProducts)
            if (pr != null && pr.getId()==searchID)
                productToRemove = pr;

        int removeChoice = JOptionPane.showConfirmDialog(null,"The details of the product you wish to amend are:\n\n" +
                productToRemove + "\n\nAre you sure you wish to remove this product?","Product Removal Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);

        if(removeChoice==JOptionPane.YES_OPTION) {
            allProducts.remove(productToRemove);
            JOptionPane.showMessageDialog(null, "Product now removed from array list!",
                    "Product Removed", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "Product removal canceled",
                    "Product Not Removed", JOptionPane.INFORMATION_MESSAGE);

        foundProducts.clear();

    }
    public static void viewProducts(ArrayList<Product>allProducts)
    {
        String allProductData="";
        Product pr;

        //using an iterator here just for practice (could have easily done without it in this case)
        Iterator<Product> iterator = allProducts.iterator();

        while(iterator.hasNext()) { // checks if theres another value to iterate to
            pr = iterator.next(); //get next element in the array-list of PRODUCT
            if (pr != null)
                allProductData += pr + "\n";
        }

        JOptionPane.showMessageDialog(null,allProductData,
                "List of all Products",JOptionPane.INFORMATION_MESSAGE);

    }

}




 /*    System.out.println("\n\nCreating two array-lists, one to maintain a collection of products,\n" +
                "the other to maintain a collection of line-items ...\n");
        //Create an array-list of LineItem objects
        ArrayList<LineItem> allLineItems = new ArrayList<LineItem>();

        //Create an array-list of Product objects
        ArrayList<Product> allProducts = new ArrayList<Product>();


        // Create Products
        Product p1 = new Product(1, "Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Marker", "This is a black permanent marker");

        allProducts.add(p1);
        allProducts.add(p2);
        allProducts.add(p3);
        allProducts.add(p4);


        // Create LineItem objects

        LineItem item1 = new LineItem(1, 3, p1);
        LineItem item2 = new LineItem(2, 4, p2);
        LineItem item3 = new LineItem(3, 2, p3);

        allLineItems.add(item1);
        allLineItems.add(item2);
        allLineItems.add(item3);

        System.out.println("There are " + allLineItems.size() + " line-items in its array");
        System.out.println("There are " + allProducts.size() + " products in its array");

        System.out.println("\nDisplaying the state of all products ...\n");
        for (Product p : allProducts)
            if (p != null)
                System.out.println(p);


        System.out.println("\n\nDisplaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);

        System.out.println("\n\nNow removing the first line-item from its array-list...\n\n");
        allLineItems.remove(0);

        System.out.println("Displaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);

        System.out.println("\n\nCreating a new product, a compass, and adding it to the array-list of products\n");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        allProducts.add(p5);

        LineItem item4 = new LineItem(4, 5, p5);

        System.out.println("\nNow adding a new line-item, for 5 compasses, to end of its array-list...\n");
        allLineItems.add(item4);

        System.out.println("There are " + allLineItems.size() + " line-items in its array");
        System.out.println("There are " + allProducts.size() + " products in its array");

        System.out.println("\nDisplaying the state of all products ...\n");
        for (Product p : allProducts)
            if (p != null)
                System.out.println(p);

        System.out.println("\n\nDisplaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);

        System.out.println("\n\nDisplaying the state of all line-items which contain products beginning with 'Pen' ...\n\n");
        for (LineItem l : allLineItems)
            if (l != null && l.getProduct().getName().startsWith("Pen"))
                System.out.println(l);

        System.out.println("\n\nNow changing product of the line-item in the 2nd position of the array-list from a ruler to a black permanent marker...");
        allLineItems.get(1).setProduct(p4);

        System.out.println("\n\nDisplaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);

        System.out.println("\nNow removing the 2nd product, the pencil, from the array-list of products...\n\n");
        allProducts.remove(1);

        System.out.println("There are " + allLineItems.size() + " line-items in its array");
        System.out.println("There are " + allProducts.size() + " products in its array");
        System.out.println("\nDisplaying the state of all products ...\n");
        for (Product p : allProducts)
            if (p != null)
                System.out.println(p);

        System.out.println("\n\nDisplaying the state of all line-items ...\n");
        for (LineItem l : allLineItems)
            if (l != null)
                System.out.println(l);*/