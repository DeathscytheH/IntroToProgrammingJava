//A landscape designer needs a program to make calculations in meters about a front yard 
//given its width and length in feet.  Write a class YardCalculator with a constructor that takes 
//the width and length in feet as arguments
//public YardCalculator(double length, double width)

//Provide methods :

//public double perimeter() which returns the perimeter in meters
//public double area() which returns the area in square meters
//public double diagonal() which returns the diagonal in meters

//1 foot = 0.3048 meters.

//Define and use a constant for the conversion factor. Define it in the class itself, 
//outside any method, so all methods in any class can see it.

//      public static final double METERS_PER_FOOT = 0.3048;

//HINT: diagonal = square root of (width^2 plus height^2)

//For the draft, provide the instance variables and  the constructor


public class YardCalculator
{
   
   double theLength;
   double theWidth;
   public static final double METERS_PER_FOOT = 0.3048;
   /**
    * Constructs a YardCalculator with the given parameters
    * @param theLength the length of the yard
    * @param theWidth the width of the yard
    */
   public YardCalculator(double theLength, double theWidth)
   {
       this.theLength=theLength*METERS_PER_FOOT;
       this.theWidth=theWidth*METERS_PER_FOOT;
   }

   /**
    * Gets the perimeter of the yard
    * @return the perimeter
    */
   public double perimeter()
   {
       return theLength*2+theWidth*2;
   }

   /**
    * Gets the area of the yard
    * @return the area
    */
   public double area()
   {
       return theLength*theWidth;
   }

    /**
    * Gets the diagonal of the yard
    * @return the diagonal
    */
   public double diagonal()
   {
       return Math.sqrt(Math.pow(theLength,2)+Math.pow(theWidth,2));
   }

}