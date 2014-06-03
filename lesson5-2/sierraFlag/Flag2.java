// Bluej project: lesson5/sierraFlag

public class Flag2
{
    private Picture pic;
    private int width;
    private int height;


    public Color getColorAt(int x, int y)
    {
        Color c;
        if (y>= height/3 && y<height*2/3 && x>=width/3 && x<width*2/3)
        {
            c=Color.BLUE;
        }
        else
        {
            c=Color.WHITE;
        }
            // TODO: Write the if/else statement to determine if a pixel should be blue or white.
            return c;
    }

    public Flag2(int width, int height)
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
