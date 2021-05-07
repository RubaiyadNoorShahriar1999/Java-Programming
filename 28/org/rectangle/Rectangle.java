package org.rectangle;

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
}