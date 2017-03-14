/*
 Task 6
 Create non-result method that will write in
 First argument of this method should define
 amount of tokens in side of the square and second
 one which token is a starting one.
*/
public class DrawSquare
{
    public static void drawSquare(int tokenAmount, int startingToken)
    {
        for(int k = 0; k < tokenAmount; k++)
        {
            for(int i = 0; i < tokenAmount; i++)
            {
                boolean ifXO;
                if(startingToken == 'x')
                {
                    ifXO = true;
                }
                else
                {
                    ifXO = false;
                }

                System.out.print(" " + (ifXO ? 'x' : 'o'));

                if(startingToken == 'x')
                {
                    startingToken = 'o';
                }
                else if ( startingToken == 'o')
                {
                    startingToken = 'x';
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        drawSquare(6, 'x');
    }
}

/* output:

 x o x o x o
 x o x o x o
 x o x o x o
 x o x o x o
 x o x o x o
 x o x o x o

*/
