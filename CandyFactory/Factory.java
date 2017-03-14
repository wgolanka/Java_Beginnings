package CandyFactory;

/*
 A task to make candy factory. There
 were specific instructions how to make it
 but I lost them somewhere.
*/
public class Factory
{
    private static Candy c1, c2;

    public static Candy make(int candyFlavor)
    {
        if ( candyFlavor == 1)
        {
            if ( c1 == null)
            {
                c1 = new Candy("chocolate", 32);
                return c1;
            }
            else
            {
                return c1;
            }
        }

        if(candyFlavor == 2)
        {
            if(c2 == null)
            {
                c2 = new Candy("banana", 54);
                return c2;
            }
            else
            {
                return c2;
            }
        }
        return null;
    }
}
