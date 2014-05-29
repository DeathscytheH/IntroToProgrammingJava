
//A landscape designer needs a program to make calculations in meters about a front yard given its width and length in feet. 
//Write a class YardCalculator with a constructor that takes the width and length in feet as parameters
//   public YardCalculator(double theLength, double theWidth)

//Provide methods: 

//   public double perimeter() which returns the perimeter in meters
//   public double area() which returns the area in square meters
//   public double diagonal() which returns the diagonal in meters

//1 foot = 0.3048 meters.


//Define and use a constant for the conversion factor. Define it in the class itself, outside any method, 
//so all the methods can use it.

//      public static  final double METERS_PER_FOOT = 0.3048;

//For the draft, provide the instance variables and the constructor. Initialize  the instance variables in the constructor

public class YardCalculator
{
   //instance variables here
   
   /**
    * Constructs a YardCalculator with the given parameters
    * @param theLength the length of the yard
    * @param theWidth the width of the yard
    */
   double theLength;
   double theWidth;
   
   public YardCalculator(double theLength, double theWidth){
       this.theLength=theLength;
       this.theWidth=theWidth;
    }
}