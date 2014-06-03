//Implement a class Balloon that models a spherical balloon that is being filled with air.  
//The constructor constructs an empty balloon (That is, the volume is 0).

//Supply these methods: 
//  void addAir(double amount) adds the given amount of air
//  double getVolume() gets the current volume
//  double getSurfaceArea() gets the current surface area
//  double getRadius() gets the current radius

//For the draft, supply the constructor and the getVolume method. Provide the instance variable.

//See this link for formulas for volume and surface area: 
//    http://math.about.com/od/formulas/ss/surfaceareavol.htm 

//Hints
//  You can find the nth root of a number by using the pow method from the Math class 
//  where the exponent is 1/n.
//  You will need to solve the volume formula for radius.


/**
 * models a spherical balloon that is being filled with air
 */
public class Balloon
{
    private double volume;

    /**
     * Constructor for objects of class Balloon
     */
    public Balloon()
    {
        volume=0;
    }

    /**
     * Gets the volume of the Balloon
     * 
     * @return    the volume of this balloon
     */
    public double getVolume()
    {
        return volume;
    }
    
    /**
    * Adds air to the Balloon
    * 
    */
    public void addAir(double amount)
    {
        volume+=amount;
    }

     /**
     * Gets the surface of the Balloon
     * 
     * @return    the surface of this balloon
     */
    public double getSurfaceArea()
    {
        double area=4*Math.PI*Math.pow(getRadius(),2);
        return area;
    }
    
    /**
     * Gets the radius of the Balloon
     * 
     * @return    the radius of this balloon
     */    
    public double getRadius()
    {
        double radius=Math.pow(((volume*3)/(Math.PI*4)),(1/3.0));
        return radius;
    }
}
