package labsheet1;

//HeightStats.java
/*This program reads in a set of 6 height values, validates each one and then processes them to determine
 *and display some statistics*/

import java.util.Scanner;

public class HeightStats{
	public static void main(String args[])
		{
			float height,smallest=0,total=0;
			int i=1,count1_3to1_9=0,over1_665=0;
			final float GLOBAL_AVERAGE_HEIGHT = 1.665f;
				
			Scanner input = new Scanner(System.in);
				    	     
            while(i<=6)
	            {
	            	System.out.print("Loop " + i + " - Please enter height: ");
                    height = input.nextFloat();
                    
                    while(height<0.5464 || height>2.72)
                    {
                    	System.out.print("Loop " + i + " - Height value invalid!!! Please re-enter height: ");
                    	height = input.nextFloat();
                    }
                    
                    total+=height;
                    
                    if(i==1)
                    	smallest = height;
                    else if(height<smallest)
                    	smallest = height;
                    	
                    if(height>=1.3 && height<=1.9)
                    	count1_3to1_9++;
                    	
                    if(height>GLOBAL_AVERAGE_HEIGHT)
                    	over1_665++;
	            
	            	i++;
	            	
	            	System.out.println("\n");
	            }

           	System.out.println("-------------------------------\n" +
    	         			   "\tHeight Statistics\n" +
    	         			   "-------------------------------\n\n");
    	         			   
    	   
            System.out.println("\nThe average of the heights entered is " + String.format("%.1f",total/6) + "m" + 
            	               "\nThe smallest height value entered is " + smallest + "m" + 
            	               "\nThe number of height values between 1.3m and 1.9m inclusive is " + count1_3to1_9 +
            	               "\nThe percentage of height values exceeding the global average height is " + String.format("%.2f",(over1_665/6f*100)) + "%");
           	   				
		}
}

