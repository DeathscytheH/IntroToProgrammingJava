/*
//Write a program called MilagePrinter that asks the user to input the following values:
//  The number of gallons currently in the tank
//  The fuel efficiency in miles per gallon

//and then prints how far the car can go on the gas in the tank and the cost of driving 100 miles. 
//Print the distance with 1 decimal point and the cost with 2 decimals.

//Use System.out.print and not System.out.println. Otherwise your output will not be
//formatted correctly

//Assume the cost per gallon is $3.95. Define it as a constant:
//     final double COST_PER_GALLON = 3.95;

// If value entered for efficiency is less than or equal to 0, 
//print "No can go". Otherwise continue with the calculations. You output should be in this
//exact format. The text will be identical - only the numbers will change.

//Sample runs for the final version:
//Enter the number of gallons of gas in the tank 5.1
//Enter the fuel efficiency 35.0
//Distance:   178.5
//Cost:       11.29

//Enter the number of gallons of gas in the tank 25
//Enter the fuel efficiency -5
//No can go 

//For the draft, define a constant for the cost per gallon and ask the user for both inputs 
//(don't forget the prompt). Then print both the number of gallons and the fuel efficiency on 
//one line with no text

//Sample run for the draft:
//Enter the number of gallons of gas in the tank 4.2
//Enter the fuel efficiency 35
//4.2 35.0 

//Important: Be sure to print the string exactly as shown 
*/
import java.util.Scanner;

public class MileagePrinter 
{
    public static void main(String[] args)
    {
        // your code here
        final double COST_PER_GALLON = 3.95;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of gallons of gas in the tank ");
        double number_of_galons = sc.nextDouble();
        
        System.out.print("Enter the fuel efficiency ");
        double fuel_efficiency = sc.nextDouble();
        
        if (fuel_efficiency<=0)
        {
            System.out.print("No can go");
        }
        else{
            double distance=number_of_galons*fuel_efficiency;
            double cost=100/fuel_efficiency*COST_PER_GALLON;
            
            System.out.printf("Distance: %.1f\n",distance);
            System.out.printf("Cost: %.2f\n",cost);            
        }
    }
}
