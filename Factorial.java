/*
 Task 5
 Count factorial of the given number
*/
public class Factorial
{
    public static long Factorial(long s) // silnia 5! 5*4*3*2*1
    {
        if(s == 1)
        {
            return s;
        }
        else
        {
            s = s* Factorial(s -1);
            return s;
        }
    }

    public static void main(String[] args)
    {
        long a = 5;
        System.out.println(Factorial(a));
    }
}
/*
output:
120
*/

