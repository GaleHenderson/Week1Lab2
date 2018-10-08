package Lab2Perimeter;

import java.util.Scanner;

public class Day1Lab2Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double lengthRm = 0;
		double widthRm = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
	      
	      //This will prompt user for measurement in inches 
	      System.out.println("In units of inches, please enter the length of the room you would like to measure, and on a new line, please enter the width: ");
	      
	      // assigns variables to user input
	      lengthRm = scan.nextDouble();
	      widthRm = scan.nextDouble();
		
	      // prints and calculate the area based on user input
	      System.out.println("The area of the room you are measuring is " + lengthRm * widthRm + " square inches.");
		
	      
	      // prints and calculate the perimeter based on user input
	      System.out.println("The perimeter of the room you are measuring is " + ((lengthRm * 2) + (widthRm * 2)) + " inches.");
	      
	      //garbage line to clean out my scanner -->important for switching from numeric to scan.nextLine().
	  		scan.nextLine();
	  		
	  		System.out.println("Would you like to continue measuring other rooms? Enter Y for yes, or N for no.");
	  		String userResponse = scan.next();

	  		//loop to ask if they would like to measure more, and subsequently prompts for more data, or are they finished and subsequently terminates.
	  		while (userResponse.equalsIgnoreCase("y")) {
		         System.out.println("In units of inches, please enter the length of the room you would like to measure, and on a new line, please enter the width: ");
		         lengthRm = scan.nextDouble();
			     widthRm = scan.nextDouble();
			     System.out.println("The area of the room you are measuring is " + lengthRm * widthRm + " square inches.");
			     System.out.println("The perimeter of the room you are measuring is " + ((lengthRm * 2) + (widthRm * 2)) + " inches.");
			     
			   //garbage line to clean out my scanner -->important for switching from numeric to scan.nextLine().
			  		scan.nextLine();
			     
			     System.out.println("Would you like to continue measuring other rooms? Enter Y for yes, or N for no.");
			     userResponse = scan.next();
		      } 
	      	if (userResponse.equalsIgnoreCase("n")) {
		    	 System.out.println("Thank you! This completes your measurement detail.");
		      }
	         
	      
	      scan.close();
	}

}
