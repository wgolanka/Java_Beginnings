package HipToBeSquare;
/*
 Basically a task to count square,
 cube, cylinder areas and volume.
*/
public class Square
{
    public double side;

    public Square(int a)
    {
        side = a;
    }
    double getSquareArea()
    {
        double area = side;
        area = side * side;
        return area;
    }
    public double getCubeVolume()
    {
        double volume = side;
        volume = side * side * side;
        return volume;
    }
    public Cylinder getCylinder()
    {
        Square square = new Square(3);

        double r = square.side /2;
        double h = square.side;
        Cylinder cylinder = new Cylinder(r, h);
        return cylinder;
    }
    public void show()
    {
        System.out.println("Square/Cube: " + "\nArea: " + getSquareArea()
                + "\nVolume: " + getCubeVolume());
    }
}
