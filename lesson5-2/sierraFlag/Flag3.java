// Bluej project: lesson5/sierraFlag

public class Flag3
{
    private Picture pic;
    private int width;
    private int height;


    public Color getColorAt(int x, int y)
    {
        Color c;
        c=Color.GREEN;
        if (y>= height/5 || y>=height*4/5)
        {
            c=Color.BLUE;
        }
        if(y>=height*2/5 && y<height*4/5)
        {
            c=Color.WHITE;
        }
        if(y>=height*3/5 && y<height*4/5)
        {
            c=Color.RED;
        }
            // TODO: Write the if/else statement to determine if a pixel should be blue or white.
            return c;
    }

    public Flag3(int width, int height)
    {
        this.width = width;
        this.height = height;
        pic = new Picture(width, height);
        pic.draw();
        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                Color c = getColorAt(x, y);
                pic.setColorAt(x, y, c);
            }
        }
    }
}
