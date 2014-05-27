// BlueJ project: lesson4/turningMathToJava
// Video: Arithmetic Operations 2

public class MathInJava
{
    /*
       Computes the fraction
           y
       --------
       x(1 + x)
    */
    public double uglyFraction(double x, double y)
    {
        // To do!
        return 0;
    }

    /*
        Computes the fraction
        2 + x(3x - 4)
        -------------
          (x+2)(x)
    */
    public double uglierFraction(double x)
    {
        // To do!
        return 0;
    }

        /*
       Computes the fraction

           1
      -----------
           1 - s
       s + -----
             n

      See http://en.wikipedia.org/wiki/Amdahl%27s_law
    */
    public double amdahlSpeedup(double s, double n)
    {
        // To do!
        double as=1/(s+((1-s)/n));
        return as;
    }

    /*
        Computes the fraction

        (a - c)(b - d)
        --------------
        (b - c)(a - d)

        See http://en.wikipedia.org/wiki/Cross-ratio
    */
    public double crossRatio(double a, double b, double c, double d)
    {
        // To do!
        double cr=((a-c)*(b-d))/((b-c)*(a-d));
        return cr;
    }

    /**
        Computes the average of four values.
        @param a the first value
        @param b the second value
        @param c the third value
        @param d the fourth value
        @return the average of the four values
    */
    public double average(int a, int b, int c, int d)
    {
        double average=(a+b+c+d)/4.0;
        return average;
    }
}
