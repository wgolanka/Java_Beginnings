package HipToBeSquare;

/*
 Basically a task to count square,
 cube, cylinder areas and volume.
*/

public class Cylinder
{
    public double r;
    public double h;

    public Cylinder(double radius, double height)
    {
        r = radius;
        h = height;
    }

    double getBaseArea() // pi * r^2
    {
        double baseArea;
        baseArea = (Math.PI* Math.pow(r, 2));

        return baseArea;

    }

    public double getVolume()
    {
        double vol;
        vol = (Math.PI * Math.pow(r, 2) * h);

        return vol;
    }

    public void showBaseArea()
    {
        System.out.println("Are of the cylinder base" +
                " surface: " + getBaseArea());

    }

    public void showVolume()
    {
        System.out.println("Cylinder volume: " + getVolume());
    }

    public void showCylinder()
    {
        System.out.println("Cylinder: " + "\nRadius: " +
                this.r + "\nHeight: " + this.h +
                "\nArea: " + getBaseArea()
                + "\nVolume: " + getVolume());
    }
}
