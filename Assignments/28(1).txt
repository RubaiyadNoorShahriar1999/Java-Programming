package org.main;

import org.rectangle.Rectangle;

public class Main 
{
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