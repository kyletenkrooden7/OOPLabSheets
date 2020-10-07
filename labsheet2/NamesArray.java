package labsheet2;

//NamesArray.java
/*This program manipulates an array of people's names. It determines the person with the longest
 *name and the average number of characters per name. It then sorts the array in ascending order 
 *using the pre-defined method sort() of the Arrays class and finally displays some results*/

import java.util.Arrays;
import javax.swing.JOptionPane;

public class NamesArray {
    public static void main(String args[])
      {
         String names[] = new String[5], longestName = "", message = "";
         int totalCharacters = 0;
         
      	 populateArray(names);
      	 
      	  for (int i = 0; i < names.length; i++)
	      	{
	      		if(names[i].length()>longestName.length())
	      				longestName = names[i];

	      		totalCharacters += names[i].length();
	        }
      	 
      	 Arrays.sort(names);
      	 
      	 message += "The longest name is " + longestName + "\n\nAverage characters per name is " + 
      	 		 String.format("%.0f",((float)totalCharacters/names.length)) + "\n\nThe array " + 
      	 		 " sorted in ascending order is:\n\n" + Arrays.toString(names);
      	 
      	 JOptionPane.showMessageDialog(null,message,"Results",JOptionPane.INFORMATION_MESSAGE); 
      	 System.exit(0);    	 
	    }

	public static void populateArray(String names[])
		{           
	      for (int i = 0; i < names.length; i++)
	      	{
	      		names[i] = JOptionPane.showInputDialog("Please enter the name of person " + (i+1));
	        }
	    }
}

       	
       	
       	
       	
       