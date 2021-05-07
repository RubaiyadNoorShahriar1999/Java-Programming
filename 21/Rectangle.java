public class Rectangle
{
    public double height;
    public double width;

    public static void main(String[] args)
    {
        Rectangle squar = new Rectangle();
        Rectangle parallelogram = new Rectangle();

        squar.height = 20.0;
        squar.width = 20.0;

        System.out.println("# Squar #");
        System.out.println("\tHeight: " + squar.height);
        System.out.println("\tWidth: " + squar.width);

        System.out.print("\n");

        parallelogram.height = 13.75;
        parallelogram.width = 18.25;

        System.out.println("# Squar #");
        System.out.println("\tHeight: " + parallelogram.height);
        System.out.println("\tWidth: " + parallelogram.width);
    }
}