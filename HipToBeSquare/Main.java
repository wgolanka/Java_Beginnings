package HipToBeSquare;

/*
 Basically a task to count square,
 cube, cylinder areas and volume.
 Also build a cylinder of the square
*/

public class Main
{
    public static void main(String[] args)
    {
        Square square = new Square(2);

        square.show();
        System.out.println();
        square.getCylinder().showCylinder();

    }
}

/* output:

Square/Cube:
Area: 4.0
Volume: 8.0

Cylinder:
Radius: 1.5
Height: 3.0
Area: 7.0685834705770345
Volume: 21.205750411731103

*/
