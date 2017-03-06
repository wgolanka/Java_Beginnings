/*
 Task 6
 Find dividers of two random numbers and
 their greatest common divisor.

 */
public class GreatestDivider
{
    public static void main(String[] args)
    {
        int firstNumber = (int) (Math.random()*100000 + 1);
        int secondNumber = (int) (Math.random()*100000 + 1 );
        int firstNumberDivider = firstNumber;
        int secondNumberDivider = secondNumber;

        System.out.print(firstNumber + " - is divisible by: " );

        while(firstNumberDivider > 0)
        {
            if(firstNumber % firstNumberDivider == 0)
            {
                System.out.print(firstNumberDivider + " ");
            }
            firstNumberDivider--;
        }

        System.out.println();
        System.out.print(secondNumber + " - is divisible by: " );

        while(secondNumberDivider > 0)
        {
            if(secondNumber % secondNumberDivider == 0)
            {
                System.out.print(secondNumberDivider + " ");
            }
            secondNumberDivider--;
        }

        System.out.println();
        boolean dividerNotFound = true;
        for( int n = firstNumber; n > 0 && dividerNotFound; n--)
        {
            for(int m = secondNumber; m > 0; m--)
            {
                if(firstNumber % n == 0 && secondNumber % m == 0 )
                {
                    if(n == m)
                    {
                        System.out.println("Greatest common divisor: " + n );
                        dividerNotFound = false;
                    }
                }
            }
        }
    }
}

/*
output:
18824 - is divisible by: 18824 9412 4706 2353 1448 724 362 181 104 52 26 13 8 4 2 1
69036 - is divisible by: 69036 34518 23012 17259 11506 6276 5753 3138 2092 1569 1046 523 132 66 44 33 22 12 11 6 4 3 2 1
Greatest common divisor: 4
*/
