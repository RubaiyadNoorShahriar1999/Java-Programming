public class Rectangle
{
    private double height;
    private double width;

    public Rectangle()
    {
        this.height = 0.0;
        this.width = 0.0;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return this.height;
    }

    public double getWidth()
    {
        return this.width;
    }

    public static void main(String[] args)
    {
        Rectangle squar = new Rectangle();
        Rectangle parallelogram = new Rectangle();

        squar.setHeight(20.0);
        squar.setWidth(20.0);

        System.out.println("# Squar #");
        System.out.println("\tHeight: " + squar.getHeight());
        System.out.println("\tWidth: " + squar.getWidth());

        System.out.print("\n");

        parallelogram.setHeight(13.75);
        parallelogram.setWidth(18.25);

        System.out.println("# Squar #");
        System.out.println("\tHeight: " + parallelogram.getHeight());
        System.out.println("\tWidth: " + parallelogram.getWidth());
    }
}