package labsheet1;

//PlanetGravity.java
/*This program calculates the acceleration due to gravity on a different planet based on
 *user-supplied values for the mass and radius of the planet and the mass and radius of Earth*/

import java.util.Scanner;

public class PlanetGravity {
	public static void main(String args[])
		{					
			final float g = 9.81f;
			float Me,Mp,re,rp,gp;    
	
			Scanner input = new Scanner(System.in);
				
			System.out.print("Please enter the mass of planet Earth: ");
			Me = input.nextFloat();
			
			System.out.print("Please enter the radius of planet Earth: ");
			re = input.nextFloat();
			
			System.out.print("Please enter the mass of the other planet: ");
			Mp = input.nextFloat();
			
			System.out.print("Please enter the radius of the other planet: ");
			rp = input.nextFloat();
			
			gp = g*Mp*re*re/(Me*rp*rp);
			
			System.out.println("\n\nThe acceleration due to gravity on the other planet is " + 
				               String.format("%.2f",gp) + " m/s/s");	
		 }
}	



