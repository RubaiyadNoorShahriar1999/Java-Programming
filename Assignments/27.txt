package org;

public class Rectangle
{
    public static int objectCount;

    private double height;
    private double width;

    public Rectangle()
    {
        this.height = 0.0;
        this.width = 0.0;

        Rectangle.objectCount++;
    }

    public Rectangle(double height, double width)
    {
        this.setHeight(height);
        this.setWidth(width);

        Rectangle.objectCount++;
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
        Rectangle squar = new Rectangle(20.0, 20.0);
        Rectangle parallelogram = new Rectangle(13.75, 18.25);

        System.out.println("# Squar #");
        System.out.println("\tHeight: " + squar.getHeight());
        System.out.println("\tWidth: " + squar.getWidth());

        System.out.print("\n");

        System.out.println("# Squar #");
        System.out.println("\tHeight: " + parallelogram.getHeight());
        System.out.println("\tWidth: " + parallelogram.getWidth());

        System.out.print("\n");

        System.out.println("# Object Count #");
        System.out.println("\tCount: " + Rectangle.objectCount);
        
    }
}