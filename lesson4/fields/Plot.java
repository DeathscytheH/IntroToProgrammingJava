// BlueJ Project: lesson4/fields

public class Plot
{
    private int width;
    private int length;

    /**
        Constructs a plot of a given size.
        @param width the width of the plot
        @param length the length of the plot
    */
    public Plot(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the number of circular fields that can fit on this plot.
     */
    public int getNumberOfFields(int radius)
    {
        // TODO: Using the formulas that Sara developed, compute
        // the total number of rows, then
        int diameter=2*radius;
        int numberRow = (int) (((length-diameter)/(radius*Math.sqrt(3)))+1);
        // the number of even and odd rows,
        int colOddRow=(width/diameter);
        int colEvenRow=((width-radius)/diameter);
        // the number of columns in each even and odd row,
        int evenRow= (numberRow/2);
        int oddRow=((numberRow+1)/2);
        // and finally the total number of fields
        int numberOfFields=colEvenRow*evenRow+colOddRow*oddRow;
        return numberOfFields;
    }
}
